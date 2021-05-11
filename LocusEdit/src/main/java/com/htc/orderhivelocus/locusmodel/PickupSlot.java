package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a PickupSlot model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class PickupSlot {

	private String start;
	private String end;

	public PickupSlot() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the start
	 */
	public String getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(String start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(String end) {
		this.end = end;
	}

}
