package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a CreatedBy model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class CreatedBy {

	private String id;

	public CreatedBy() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CreatedBy [id=" + id + "]";
	}

}
