package com.htc.orderhivelocus.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a model class for ApiGatewayRequest.
 * 
 * @author Nirmal
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class ApiGatewayRequest {
	public String body;
	public Map<String, String> queryStringParameters = new HashMap<String, String> ();
}
