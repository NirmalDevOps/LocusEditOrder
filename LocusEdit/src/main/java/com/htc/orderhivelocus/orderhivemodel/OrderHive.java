/**
 * 
 */
package com.htc.orderhivelocus.orderhivemodel;

/**
 * Represents a OrderHive model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class OrderHive {
	
	Data data;
	private String event_name;
	private String request_id;
	private String timestamp;
	public OrderHive() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}

	/**
	 * @return the event_name
	 */
	public String getEvent_name() {
		return event_name;
	}
	/**
	 * @param event_name the event_name to set
	 */
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	/**
	 * @return the request_id
	 */
	public String getRequest_id() {
		return request_id;
	}
	/**
	 * @param request_id the request_id to set
	 */
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "OrderHive [data=" + data + ", event_name=" + event_name + ", request_id=" + request_id + ", timestamp="
				+ timestamp + "]";
	}
	
}
