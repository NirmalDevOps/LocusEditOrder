package com.htc.orderhivelocus.orderhivemodel;

/**
 * Represents a OrderExtraItems model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class OrderExtraItems {

	private Long id;
	private String name;

	public OrderExtraItems() {
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

	@Override
	public String toString() {
		return "OrderExtraItems [id=" + id + ", name=" + name + "]";
	}

}
