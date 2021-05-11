/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a CancelOrderStatusMessage  model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class CancelOrderStatusMessage {

	private String message;

	public CancelOrderStatusMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CancelOrderStatusMessage [message=" + message + "]";
	}
	
	
}
