package com.htc.locuseditorder.main;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.htc.locuseditorder.util.LocusConstants;
import com.htc.orderhivelocusconvertorproject.locusmodel.Body;
import com.htc.orderhivelocusconvertorproject.orderhivemodel.OrderHive;
import com.htc.orderhivelocusconvertorproject.serviceImpl.OrderhiveLocusConvertorServiceImpl;

/**
 * Represents a Class for Locus Update/Edit Order to hit the Locus API and get
 * the Response
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class LocusEditOrder implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
	private final ObjectMapper objectMapper = new ObjectMapper()
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	static final Logger LOGGER = LoggerFactory.getLogger(LocusEditOrder.class);

	/**
	 * This method is used to handle Initial Request from OrderHive
	 * 
	 * @param input, context
	 * @return
	 */
	@Override
	public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
		String locusRequestBuildResponse = null;
		OrderHive orderHive = null;
		APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
		LambdaLogger logger = context.getLogger();
		OrderhiveLocusConvertorServiceImpl orderhiveLocusConvertorServiceImplObj = new OrderhiveLocusConvertorServiceImpl();
		logger.log("Handling EditOrder Request.." + input.getBody().toString());
		try {
			orderHive = objectMapper.readValue(input.getBody(), OrderHive.class);
		} catch (JsonProcessingException e) {
			LOGGER.error(LocusConstants.ERROR_MESSAGE + e.getMessage());
		}

		try {
			LOGGER.info("Invoking the Converter");
			locusRequestBuildResponse = orderhiveLocusConvertorServiceImplObj.buildLocusUpdateOrderRequest(orderHive);
			LOGGER.info("Successfully invoked the converted and converted the orderhive JSON to Locus JSON");
		} catch (Exception e) {
			LOGGER.error("Error occured while invoing the convertor: " + e.getMessage());
		}

		// After successfully converted the JSON to locus, Trying to call the Locus
		// API'S to edit the order
		if (null != locusRequestBuildResponse) {
			ResponseEntity<String> locusResponse = getResponseFromLocusAPI(locusRequestBuildResponse);
			LOGGER.info("Got the response in main method");

			if (locusResponse.getStatusCode().value() == (HttpStatus.OK.value())) {
				LOGGER.info("locusResponse.getStatusCode().value()" + locusResponse.getStatusCode().value() + "\t"
						+ (HttpStatus.OK.value()));
				response = buildLocusEditOrderResponse(locusResponse, LocusConstants.SUCCESS);
			} else {
				boolean successFlag = false;
				for (int count = 2; count < LocusConstants.ORDER_EDIT_COUNT; count++) {

					locusResponse = getResponseFromLocusAPI(locusRequestBuildResponse);
					if (locusResponse.getStatusCode().equals(HttpStatus.OK))
						successFlag = true;

					LOGGER.info("Success Flag::" + successFlag);

					if (successFlag == true) {
						response = buildLocusEditOrderResponse(locusResponse, LocusConstants.SUCCESS);
						break;
					} else {
						if (count == LocusConstants.COUNT_FINAL) {
							LOGGER.info("Going to build Final Response after hitting three times:");
							response = buildLocusEditOrderResponse(locusResponse, LocusConstants.FAILURE);
							break;
						}
					}

				}
			}
		} else {
			response.setStatusCode(HttpStatus.CONFLICT.value());
			response.setBody(LocusConstants.ERROR_IN_PROCESSING);
		}

		return response;
	}

	/**
	 * This private method is used to handle Success / Failure Response
	 * 
	 * @param locusResponse, status
	 * @return
	 */
	private APIGatewayProxyResponseEvent buildLocusEditOrderResponse(ResponseEntity<String> locusResponse,
			String status) {
		APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
		JSONObject locusAPIResponseJsonObj = null;

		if (status.equalsIgnoreCase(LocusConstants.SUCCESS)) {
			response.setStatusCode(HttpStatus.OK.value());
			LOGGER.info(LocusConstants.SUCCESS_CODE + HttpStatus.OK.value());
			LOGGER.info(LocusConstants.ORDER_EDITION_SUCCESS);
			LOGGER.info(LocusConstants.SUCCESS_CODE + HttpStatus.OK.value());
		} else {
			response.setStatusCode(locusResponse.getStatusCodeValue());
			LOGGER.info(LocusConstants.ERROR_STATUS_CODE + locusResponse.getStatusCodeValue());
			LOGGER.info(LocusConstants.ORDER_EDITION_FAILED);
			LOGGER.info(LocusConstants.ERROR_STATUS_CODE + locusResponse.getStatusCodeValue());
		}
		locusAPIResponseJsonObj = new JSONObject(locusResponse.getBody());
		response.setBody(locusAPIResponseJsonObj.toString());
		return response;
	}

	/**
	 * This private method is used to hit the Locus URL and get the Response
	 * 
	 * @param locusRequestJson
	 * @return
	 */
	private ResponseEntity<String> getResponseFromLocusAPI(String locusRequestJson) {
		ResponseEntity<String> locusResponse = null;
		Body locusEditModelObjectBody = null;

		try {
			locusEditModelObjectBody = objectMapper.readValue(locusRequestJson, Body.class);
		} catch (JsonProcessingException e) {
			LOGGER.error(LocusConstants.ERROR_MESSAGE + e.getMessage());
		}

		String requestJson = "";
		try {
			requestJson = objectMapper.writeValueAsString(locusEditModelObjectBody);
		} catch (JsonProcessingException e) {
			LOGGER.error(LocusConstants.ERROR_MESSAGE + e.getMessage());
		}
		try {

			StringBuilder locusUrlBuilder = buildURL(locusEditModelObjectBody);

			String locusURL = locusUrlBuilder.toString();

			HttpHeaders headers = setHeaderContent();
			RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());

			LOGGER.info("Rest Template Obj initialized");
			HttpEntity<String> entity = new HttpEntity<String>(requestJson.toString(), headers);
			LOGGER.info("HttpEntity Body As aString::" + entity.getBody().toString());
			LOGGER.info("Going to call Locus API::" + locusURL);

			restTemplate.getInterceptors()
					.add(new BasicAuthorizationInterceptor(LocusConstants.CLIENT_ID, LocusConstants.AUTHORIZATION_KEY));
			// send request and parse result
			locusResponse = restTemplate.exchange(locusURL, HttpMethod.POST, entity, String.class);
		} catch (HttpClientErrorException e) {
			locusResponse = new ResponseEntity<String>(e.getStatusCode());

			LOGGER.error(LocusConstants.ERROR_MESSAGE + e.getMessage());
		}
		return locusResponse;
	}

	private StringBuilder buildURL(Body locusEditModelObjectBody) {
		StringBuilder locusUrlBuilder = new StringBuilder("https://oms.locus-api.com/v1/client/")
				.append(locusEditModelObjectBody.getClientId()).append("/order/")
				.append(locusEditModelObjectBody.getId());
		return locusUrlBuilder;
	}

	/**
	 * @return
	 */
	private SimpleClientHttpRequestFactory getClientHttpRequestFactory() {
		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory(); // Connect
		clientHttpRequestFactory.setConnectTimeout(LocusConstants.CONNECTION_TIME_OUT);
		// Read timeout
		clientHttpRequestFactory.setReadTimeout(LocusConstants.READING_TIME_OUT);
		return clientHttpRequestFactory;
	}

	/**
	 * @return
	 */
	private HttpHeaders setHeaderContent() {
		HttpHeaders headers = new HttpHeaders();
		// Base64.Encoder encoder = Base64.getEncoder();
		// String clientIdAndSecret = "AI8VB2XP22X8ZVNWTOWYRZ2BNUDIWF24" + ":" +
		// "46YE18NHS8NKX8XWRCYELN4KVCALC8EA"; //String clientIdAndSecretBase64 =
		// encoder.encodeToString(clientIdAndSecret.getBytes());
		// headers.add("Authorization", "Basic " + clientIdAndSecretBase64);
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

}
