/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a ContactPoint model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class ContactPoint {
	
	private String name;
	private String number;
	public ContactPoint() {
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
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "ContactPoint [name=" + name + ", number=" + number + "]";
	}
	
	
	


}
