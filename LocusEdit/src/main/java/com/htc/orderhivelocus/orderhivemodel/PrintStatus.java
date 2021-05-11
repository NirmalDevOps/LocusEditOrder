/**
 * 
 */
package com.htc.orderhivelocus.orderhivemodel;

/**
 * Represents a PrintStatus model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class PrintStatus {

	private boolean invoicePrinted;
	private boolean orderPrinted;

	public PrintStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the invoicePrinted
	 */
	public boolean isInvoicePrinted() {
		return invoicePrinted;
	}

	/**
	 * @param invoicePrinted the invoicePrinted to set
	 */
	public void setInvoicePrinted(boolean invoicePrinted) {
		this.invoicePrinted = invoicePrinted;
	}

	/**
	 * @return the orderPrinted
	 */
	public boolean isOrderPrinted() {
		return orderPrinted;
	}

	/**
	 * @param orderPrinted the orderPrinted to set
	 */
	public void setOrderPrinted(boolean orderPrinted) {
		this.orderPrinted = orderPrinted;
	}

	@Override
	public String toString() {
		return "PrintStatus [invoicePrinted=" + invoicePrinted + ", orderPrinted=" + orderPrinted + "]";
	}

}
