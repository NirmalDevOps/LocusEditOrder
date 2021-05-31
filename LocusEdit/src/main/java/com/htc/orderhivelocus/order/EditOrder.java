package com.htc.orderhivelocus.order;

/**
 * Represents a model class for EditOrder.
 * 
 * @author Nirmal
 * @version 1.0
 * @since 30-03-2021
 * 
 */
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
import org.springframework.web.client.RestTemplate;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.htc.connector.util.Constant;
import com.htc.orderhivelocus.impl.CreateOrderImpl;
import com.htc.orderhivelocus.locusmodel.Body;
import com.htc.orderhivelocus.orderhivemodel.OrderHive;

public class EditOrder implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
	private final ObjectMapper objectMapper = new ObjectMapper()
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	static final Logger LOGGER = LoggerFactory.getLogger(EditOrder.class);

	@Override
	public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {

		String locusRequestBuildResponse = null;
		OrderHive orderHive = null;

		APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();

		try {
			orderHive = objectMapper.readValue(input.getBody(), OrderHive.class);
			LOGGER.info("JSON Structure from WebHook: " + orderHive);
			System.out.println("JSON Structure from WebHook: " + orderHive);
		} catch (JsonProcessingException e) {
			LOGGER.error("Error: " + e);
		}
		CreateOrderImpl createOrderImpl = new CreateOrderImpl();
		locusRequestBuildResponse = createOrderImpl.editOrder(orderHive);

		LOGGER.info("locusRequestBuildResponse===>" + locusRequestBuildResponse);
		if (null != locusRequestBuildResponse) {
			ResponseEntity<String> locusResponse = getResponseFromLocusAPI(locusRequestBuildResponse);
			LOGGER.info("Got the response in main method");

			if (locusResponse.getStatusCode().value() == (HttpStatus.OK.value())) {
				LOGGER.info("locusResponse.getStatusCode().value()" + locusResponse.getStatusCode().value() + "\t"
						+ (HttpStatus.OK.value()));
				response = buildLocusEditOrderResponse(locusResponse, Constant.SUCCESS);
			} else {
				boolean successFlag = false;
				for (int count = 2; count < Constant.ORDER_CANCEL_COUNT; count++) {

					locusResponse = getResponseFromLocusAPI(locusRequestBuildResponse);
					if (locusResponse.getStatusCode().equals(HttpStatus.OK))
						successFlag = true;

					LOGGER.info("Success Flag::" + successFlag);

					if (successFlag == true) {
						response = buildLocusEditOrderResponse(locusResponse, Constant.SUCCESS);
						break;
					} else {
						if (count == 3) {
							LOGGER.info("Going to build Final Response after hitting three times:");
							response = buildLocusEditOrderResponse(locusResponse, Constant.FAILURE);
							break;
						}
					}

				}
			}
		} else {
			response.setStatusCode(HttpStatus.CONFLICT.value());
			response.setBody("Error in processing Locus Request Body");
		}
		System.out.println("Final Response  :" + response);
		return response;
	}

	private APIGatewayProxyResponseEvent buildLocusEditOrderResponse(ResponseEntity<String> locusResponse,
			String status) {
		APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
		JSONObject locusAPIResponseJsonObj = null;

		if (status.equalsIgnoreCase(Constant.SUCCESS)) {
			response.setStatusCode(HttpStatus.OK.value());

			LOGGER.info(Constant.SUCCESS_STATUS_CODE + HttpStatus.OK.value());
		} else {
			response.setStatusCode(locusResponse.getStatusCodeValue());
			LOGGER.info(Constant.ERROR_STATUS_CODE + locusResponse.getStatusCodeValue());
		}

		locusAPIResponseJsonObj = new JSONObject(locusResponse.getBody());
		response.setBody(locusAPIResponseJsonObj.toString());
		return response;
	}

	private ResponseEntity<String> getResponseFromLocusAPI(String locusRequestJson) {
		ResponseEntity<String> locusResponse = null;

		Body locusEditModelObjectBody = null;
		try {
			locusEditModelObjectBody = objectMapper.readValue(locusRequestJson, Body.class);
			LOGGER.info("locusEditModelObjectBody :" + locusEditModelObjectBody);
			System.out.println("locusEditModelObjectBody :" + locusEditModelObjectBody);
		} catch (JsonProcessingException e) {
			LOGGER.error("Error: " + e);
		}

		String requestJson = "";
		try {
			requestJson = objectMapper.writeValueAsString(locusEditModelObjectBody);
			LOGGER.info("requestJson :" + requestJson);
		} catch (JsonProcessingException e) {
			LOGGER.error("Error: " + e);
		}
		StringBuilder locusUrlBuilder = new StringBuilder("https://oms.locus-api.com/v1/client/")
				.append(locusEditModelObjectBody.getClientId()).append("/order/")
				.append(locusEditModelObjectBody.getId());

		String locusURL = locusUrlBuilder.toString();
		HttpHeaders headers = setHeaderContent();

		RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());
		HttpEntity<String> entity = new HttpEntity<String>(requestJson.toString(), headers);
		LOGGER.info("Going to call Locus API::" + locusURL);
		restTemplate.getInterceptors()
				.add(new BasicAuthorizationInterceptor("arki-devo", "167eb8d0-aab4-44e0-99c4-0469945d2bae"));

		// send request and parse result
		locusResponse = restTemplate.exchange(locusURL, HttpMethod.POST, entity, String.class);
		return locusResponse;
	}

	private SimpleClientHttpRequestFactory getClientHttpRequestFactory() {
		SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory(); // Connect
		clientHttpRequestFactory.setConnectTimeout(Constant.CONNECTION_TIME_OUT);
		// Read timeout
		clientHttpRequestFactory.setReadTimeout(Constant.READING_TIME_OUT);
		return clientHttpRequestFactory;
	}

	private HttpHeaders setHeaderContent() {
		HttpHeaders headers = new HttpHeaders();
		// Base64.Encoder encoder = Base64.getEncoder();

		// String clientIdAndSecret = "AI8VB2XP22X8ZVNWTOWYRZ2BNUDIWF24" + ":" +
		// "46YE18NHS8NKX8XWRCYELN4KVCALC8EA"; //String clientIdAndSecretBase64 =
		// encoder.encodeToString(clientIdAndSecret.getBytes());

		// System.out.println("Base64 converted value::"+clientIdAndSecretBase64);

		// headers.add("Authorization", "Basic " + clientIdAndSecretBase64);
		headers.setContentType(MediaType.APPLICATION_JSON);

		return headers;
	}

}
