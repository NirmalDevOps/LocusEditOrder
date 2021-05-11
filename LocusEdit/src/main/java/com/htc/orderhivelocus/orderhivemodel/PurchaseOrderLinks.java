package com.htc.orderhivelocus.orderhivemodel;


/**
 * Represents a PurchaseOrderLinks model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class PurchaseOrderLinks {
	private Long id;
	private String URL;
	public PurchaseOrderLinks() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the uRL
	 */
	public String getURL() {
		return URL;
	}
	/**
	 * @param uRL the uRL to set
	 */
	public void setURL(String uRL) {
		URL = uRL;
	}
	@Override
	public String toString() {
		return "PurchaseOrderLinks [id=" + id + ", URL=" + URL + "]";
	}
	
	
	

}
