/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

import java.util.Arrays;

/**
 * Represents a Filters model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class Filters {
	private String name;
	private String operation;
	String[] values;

	public Filters() {
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
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * @return the values
	 */
	public String[] getValues() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(String[] values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "Filters [name=" + name + ", operation=" + operation + ", values=" + Arrays.toString(values) + "]";
	}

}
