package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a Amout modul class to set its value, currency and symbol. 
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class Amount {

	private Integer amount;
	private String currency;
	private String symbol;

	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	


	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}


	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}


	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}


	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	@Override
	public String toString() {
		return "Amount [amount=" + amount + ", currency=" + currency + ", symbol=" + symbol + "]";
	}


	
}
