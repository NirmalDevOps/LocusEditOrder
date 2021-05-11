/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a DropAppFields model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class DropAppFields {

	private Items items;

	public DropAppFields() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the items
	 */
	public Items getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Items items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "DropAppFields [items=" + items + "]";
	}

}
