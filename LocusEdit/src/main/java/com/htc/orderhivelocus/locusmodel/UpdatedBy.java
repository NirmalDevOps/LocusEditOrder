package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a UpdatedBy model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class UpdatedBy {

	private String id;

	public UpdatedBy() {
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
