package com.htc.orderhivelocus.orderhivemodel;

/**
 * Represents a Tags model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class Tags {

	private Long tag_id;
	private Long id;
	private Long linked_id;
	private String tag_name;
	private String tag_color;

	public Tags() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tag_id
	 */
	public Long getTag_id() {
		return tag_id;
	}

	/**
	 * @param tag_id the tag_id to set
	 */
	public void setTag_id(Long tag_id) {
		this.tag_id = tag_id;
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
	 * @return the linked_id
	 */
	public Long getLinked_id() {
		return linked_id;
	}

	/**
	 * @param linked_id the linked_id to set
	 */
	public void setLinked_id(Long linked_id) {
		this.linked_id = linked_id;
	}

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

	/**
	 * @return the tag_color
	 */
	public String getTag_color() {
		return tag_color;
	}

	/**
	 * @param tag_color the tag_color to set
	 */
	public void setTag_color(String tag_color) {
		this.tag_color = tag_color;
	}

	@Override
	public String toString() {
		return "Tags [tag_id=" + tag_id + ", id=" + id + ", linked_id=" + linked_id + ", tag_name=" + tag_name
				+ ", tag_color=" + tag_color + "]";
	}

}
