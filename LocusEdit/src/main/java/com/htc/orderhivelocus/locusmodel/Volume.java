/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a Volume model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class Volume {

	private String value;
	private String unit;

	public Volume() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Volume [value=" + value + ", unit=" + unit + "]";
	}

}
