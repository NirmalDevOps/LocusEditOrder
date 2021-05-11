/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a Price model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class Price {
	
	private Double amount;
	private String currency;
	private String symbol;
	
	
	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
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
		return "Price [amount=" + amount + ", currency=" + currency + ", symbol=" + symbol + "]";
	}
	
	
	
	
	

}
