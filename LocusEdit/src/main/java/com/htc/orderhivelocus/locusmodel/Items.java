/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a Items model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class Items {

	private String item;
	private String format;
	AdditionalValues additionalValues;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the additionalValues
	 */
	public AdditionalValues getAdditionalValues() {
		return additionalValues;
	}

	/**
	 * @param additionalValues the additionalValues to set
	 */
	public void setAdditionalValues(AdditionalValues additionalValues) {
		this.additionalValues = additionalValues;
	}

	@Override
	public String toString() {
		return "Items [item=" + item + ", format=" + format + ", additionalValues=" + additionalValues + "]";
	}

}
