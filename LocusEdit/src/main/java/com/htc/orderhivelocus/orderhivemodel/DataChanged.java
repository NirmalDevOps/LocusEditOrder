/**
 * 
 */
package com.htc.orderhivelocus.orderhivemodel;

/**
 * Represents a DataChanged model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class DataChanged {
	
	private String tag_name;

	/**
	 * @return the tag_name
	 */
	public String getTag_name() {
		return tag_name;
	}

	/**
	 * @param tag_name the tag_name to set
	 */
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	@Override
	public String toString() {
		return "DataChanged [tag_name=" + tag_name + "]";
	}
	
	

}
