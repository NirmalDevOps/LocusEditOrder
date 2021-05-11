package com.htc.orderhivelocus.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.htc.orderhivelocus.orderhivemodel.OrderHive;

/**
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class CreateOrderImpl {
	
	static final Logger LOGGER = LoggerFactory.getLogger(OrderHiveLocusRequestConverterImpl.class);

	public String editOrder(OrderHive orderhive) 
	{
		OrderHiveLocusRequestConverterImpl orderHiveLocusRequestConverterImpl = new OrderHiveLocusRequestConverterImpl();
		String jsonResponseForLocus = null;
		try {
			jsonResponseForLocus = orderHiveLocusRequestConverterImpl.convertOrderHiveRequestToLocusRequest(orderhive);
			LOGGER.info("JSON Response successfully converted for locus"+jsonResponseForLocus);
		}catch(Exception e) {
			LOGGER.error("Error: "+e);
		}
		return jsonResponseForLocus;
	}
} 
