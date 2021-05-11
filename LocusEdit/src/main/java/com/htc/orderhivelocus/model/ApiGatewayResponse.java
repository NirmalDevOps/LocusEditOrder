package com.htc.orderhivelocus.model;

/**
 * Represents a model class for ApiGatewayResponse.
 * 
 * @author Nirmal
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class ApiGatewayResponse {
	public Integer statusCode;
	public String body;
	
	public ApiGatewayResponse(Integer statusCode, String body) {
		this.statusCode = statusCode;
		this.body = body;
	}
}
