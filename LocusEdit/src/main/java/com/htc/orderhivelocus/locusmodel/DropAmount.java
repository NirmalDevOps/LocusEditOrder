/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a DropAmount model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class DropAmount {

	private Amount amount;
	private String exchangeType;

	public DropAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the amount
	 */
	public Amount getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	/**
	 * @return the exchangeType
	 */
	public String getExchangeType() {
		return exchangeType;
	}

	/**
	 * @param exchangeType the exchangeType to set
	 */
	public void setExchangeType(String exchangeType) {
		this.exchangeType = exchangeType;
	}

	@Override
	public String toString() {
		return "DropAmount [amount=" + amount + ", exchangeType=" + exchangeType + "]";
	}

}
