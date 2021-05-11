/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

import java.util.List;

/**
 * Represents a OrderSelectRequest model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class OrderSelectRequest {
	
	List<Filters> filters;

	public OrderSelectRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the filters
	 */
	public List<Filters> getFilters() {
		return filters;
	}

	/**
	 * @param filters the filters to set
	 */
	public void setFilters(List<Filters> filters) {
		this.filters = filters;
	}

	@Override
	public String toString() {
		return "OrderSelectRequest [filters=" + filters + "]";
	}
	
	
	

}
