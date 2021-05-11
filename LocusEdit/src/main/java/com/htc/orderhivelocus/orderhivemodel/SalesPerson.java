package com.htc.orderhivelocus.orderhivemodel;


/**
 * Represents a SalesPerson model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class SalesPerson {

	private String name;
	private Long id;
	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "SalesPerson [name=" + name + ", id=" + id + "]";
	}
	
}
