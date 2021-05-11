package com.htc.orderhivelocus.orderhivemodel;

import java.util.List;



/**
 * Represents a Data model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class Data {

	private Long id;
	private String export_type;

	SalesPerson sales_person;
	private boolean partially_cancel;

	List<SubUsers> sub_users;
	private String remark;

	Address billing_address;

	Address shipping_address;

	private String channel_order_id;
	private int contact_id;
	private String sync_created;
	private String order_status;
	private double grand_total;
	private int total;
	private String store_name;
	private boolean is_back_order;

	private String currency;
	private boolean invoice_created;
	private String payment_method;

	List<OrderItems> order_items;

	private Long store_id;
	private String channel_name;

	List<PurchaseOrderLinks> purchase_order_links;
	private String payment_status;
	private Long custom_status;
	private String modified_date;

	List<Tags> tags;
	private String tax_type;

	List<CustomFieldsListing> custom_fields_listing;

	private String display_number;
	private String created_date;
	private Long channel_id;

	List<OrderExtraItems> order_extra_items;

	private String warehouse_id;

	private String delivery_date;
	private Long sales_person_id;

	PrintStatus printStatus;

	// This Field added for Tagged
	private String channel_order_number;
	private Long parent_order_id;
	private String barcode;
	private Long default_supplier_id;

	private String base_currency;
	private String base_currency_rate;

	private String reference_number;
	private String order_type;

	
	
	/**
	 * @return the parent_order_id
	 */
	public Long getParent_order_id() {
		return parent_order_id;
	}

	/**
	 * @param parent_order_id the parent_order_id to set
	 */
	public void setParent_order_id(Long parent_order_id) {
		this.parent_order_id = parent_order_id;
	}

	/**
	 * @return the barcode
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * @param barcode the barcode to set
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	/**
	 * @return the default_supplier_id
	 */
	public Long getDefault_supplier_id() {
		return default_supplier_id;
	}

	/**
	 * @param default_supplier_id the default_supplier_id to set
	 */
	public void setDefault_supplier_id(Long default_supplier_id) {
		this.default_supplier_id = default_supplier_id;
	}

	/**
	 * @return the store_id
	 */
	public Long getStore_id() {
		return store_id;
	}

	/**
	 * @return the custom_status
	 */
	public Long getCustom_status() {
		return custom_status;
	}

	/**
	 * @return the channel_id
	 */
	public Long getChannel_id() {
		return channel_id;
	}

	/**
	 * @return the order_status
	 */
	public String getOrder_status() {
		return order_status;
	}

	/**
	 * @param order_status the order_status to set
	 */
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	/**
	 * @return the order_type
	 */
	public String getOrder_type() {
		return order_type;
	}

	/**
	 * @param order_type the order_type to set
	 */
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public Data() {
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
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the channel_order_id
	 */
	public String getChannel_order_id() {
		return channel_order_id;
	}

	/**
	 * @param channel_order_id the channel_order_id to set
	 */
	public void setChannel_order_id(String channel_order_id) {
		this.channel_order_id = channel_order_id;
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
	 * @return the base_currency
	 */
	public String getBase_currency() {
		return base_currency;
	}

	/**
	 * @param base_currency the base_currency to set
	 */
	public void setBase_currency(String base_currency) {
		this.base_currency = base_currency;
	}

	/**
	 * @return the base_currency_rate
	 */
	public String getBase_currency_rate() {
		return base_currency_rate;
	}

	/**
	 * @param base_currency_rate the base_currency_rate to set
	 */
	public void setBase_currency_rate(String base_currency_rate) {
		this.base_currency_rate = base_currency_rate;
	}

	/**
	 * @return the payment_method
	 */
	public String getPayment_method() {
		return payment_method;
	}

	/**
	 * @param payment_method the payment_method to set
	 */
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	/**
	 * @return the payment_status
	 */
	public String getPayment_status() {
		return payment_status;
	}

	/**
	 * @param payment_status the payment_status to set
	 */
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	/**
	 * @return the channel_order_number
	 */
	public String getChannel_order_number() {
		return channel_order_number;
	}

	/**
	 * @param channel_order_number the channel_order_number to set
	 */
	public void setChannel_order_number(String channel_order_number) {
		this.channel_order_number = channel_order_number;
	}

	/**
	 * @return the reference_number
	 */
	public String getReference_number() {
		return reference_number;
	}

	/**
	 * @param reference_number the reference_number to set
	 */
	public void setReference_number(String reference_number) {
		this.reference_number = reference_number;
	}

	/**
	 * @return the grand_total
	 */
	public double getGrand_total() {
		return grand_total;
	}

	/**
	 * @param grand_total the grand_total to set
	 */
	public void setGrand_total(double grand_total) {
		this.grand_total = grand_total;
	}

	/**
	 * @return the sync_created
	 */
	public String getSync_created() {
		return sync_created;
	}

	/**
	 * @param sync_created the sync_created to set
	 */
	public void setSync_created(String sync_created) {
		this.sync_created = sync_created;
	}

	/**
	 * @return the delivery_date
	 */
	public String getDelivery_date() {
		return delivery_date;
	}

	/**
	 * @param delivery_date the delivery_date to set
	 */
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	/**
	 * @return the sales_person_id
	 */
	public Long getSales_person_id() {
		return sales_person_id;
	}

	/**
	 * @param sales_person_id the sales_person_id to set
	 */
	public void setSales_person_id(Long sales_person_id) {
		this.sales_person_id = sales_person_id;
	}

	/**
	 * @param store_id the store_id to set
	 */
	public void setStore_id(Long store_id) {
		this.store_id = store_id;
	}

	/**
	 * @param custom_status the custom_status to set
	 */
	public void setCustom_status(Long custom_status) {
		this.custom_status = custom_status;
	}

	/**
	 * @param channel_id the channel_id to set
	 */
	public void setChannel_id(Long channel_id) {
		this.channel_id = channel_id;
	}

	/**
	 * @return the tax_type
	 */
	public String getTax_type() {
		return tax_type;
	}

	/**
	 * @param tax_type the tax_type to set
	 */
	public void setTax_type(String tax_type) {
		this.tax_type = tax_type;
	}

	/**
	 * @return the contact_id
	 */
	public int getContact_id() {
		return contact_id;
	}

	/**
	 * @param contact_id the contact_id to set
	 */
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	/**
	 * @return the export_type
	 */
	public String getExport_type() {
		return export_type;
	}

	/**
	 * @param export_type the export_type to set
	 */
	public void setExport_type(String export_type) {
		this.export_type = export_type;
	}

	/**
	 * @return the sales_person
	 */
	public SalesPerson getSales_person() {
		return sales_person;
	}

	/**
	 * @param sales_person the sales_person to set
	 */
	public void setSales_person(SalesPerson sales_person) {
		this.sales_person = sales_person;
	}

	/**
	 * @return the partially_cancel
	 */
	public boolean isPartially_cancel() {
		return partially_cancel;
	}

	/**
	 * @param partially_cancel the partially_cancel to set
	 */
	public void setPartially_cancel(boolean partially_cancel) {
		this.partially_cancel = partially_cancel;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @return the store_name
	 */
	public String getStore_name() {
		return store_name;
	}

	/**
	 * @param store_name the store_name to set
	 */
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	/**
	 * @return the is_back_order
	 */
	public boolean isIs_back_order() {
		return is_back_order;
	}

	/**
	 * @param is_back_order the is_back_order to set
	 */
	public void setIs_back_order(boolean is_back_order) {
		this.is_back_order = is_back_order;
	}

	/**
	 * @return the invoice_created
	 */
	public boolean isInvoice_created() {
		return invoice_created;
	}

	/**
	 * @param invoice_created the invoice_created to set
	 */
	public void setInvoice_created(boolean invoice_created) {
		this.invoice_created = invoice_created;
	}

	/**
	 * @return the shipping_address
	 */
	public Address getShipping_address() {
		return shipping_address;
	}

	/**
	 * @param shipping_address the shipping_address to set
	 */
	public void setShipping_address(Address shipping_address) {
		this.shipping_address = shipping_address;
	}

	/**
	 * @return the order_items
	 */
	public List<OrderItems> getOrder_items() {
		return order_items;
	}

	/**
	 * @param order_items the order_items to set
	 */
	public void setOrder_items(List<OrderItems> order_items) {
		this.order_items = order_items;
	}

	/**
	 * @return the billing_address
	 */
	public Address getBilling_address() {
		return billing_address;
	}

	/**
	 * @param billing_address the billing_address to set
	 */
	public void setBilling_address(Address billing_address) {
		this.billing_address = billing_address;
	}

	/**
	 * @return the channel_name
	 */
	public String getChannel_name() {
		return channel_name;
	}

	/**
	 * @param channel_name the channel_name to set
	 */
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	/**
	 * @return the purchase_order_links
	 */
	public List<PurchaseOrderLinks> getPurchase_order_links() {
		return purchase_order_links;
	}

	/**
	 * @param purchase_order_links the purchase_order_links to set
	 */
	public void setPurchase_order_links(List<PurchaseOrderLinks> purchase_order_links) {
		this.purchase_order_links = purchase_order_links;
	}

	/**
	 * @return the modified_date
	 */
	public String getModified_date() {
		return modified_date;
	}

	/**
	 * @param modified_date the modified_date to set
	 */
	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}

	/**
	 * @return the tags
	 */
	public List<Tags> getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}

	/**
	 * @return the custom_fields_listing
	 */
	public List<CustomFieldsListing> getCustom_fields_listing() {
		return custom_fields_listing;
	}

	/**
	 * @param custom_fields_listing the custom_fields_listing to set
	 */
	public void setCustom_fields_listing(List<CustomFieldsListing> custom_fields_listing) {
		this.custom_fields_listing = custom_fields_listing;
	}

	/**
	 * @return the display_number
	 */
	public String getDisplay_number() {
		return display_number;
	}

	/**
	 * @param display_number the display_number to set
	 */
	public void setDisplay_number(String display_number) {
		this.display_number = display_number;
	}

	/**
	 * @return the created_date
	 */
	public String getCreated_date() {
		return created_date;
	}

	/**
	 * @param created_date the created_date to set
	 */
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	/**
	 * @return the order_extra_items
	 */
	public List<OrderExtraItems> getOrder_extra_items() {
		return order_extra_items;
	}

	/**
	 * @param order_extra_items the order_extra_items to set
	 */
	public void setOrder_extra_items(List<OrderExtraItems> order_extra_items) {
		this.order_extra_items = order_extra_items;
	}

	/**
	 * @return the warehouse_id
	 */
	public String getWarehouse_id() {
		return warehouse_id;
	}

	/**
	 * @param warehouse_id the warehouse_id to set
	 */
	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	/**
	 * @return the sub_users
	 */
	public List<SubUsers> getSub_users() {
		return sub_users;
	}

	/**
	 * @param sub_users the sub_users to set
	 */
	public void setSub_users(List<SubUsers> sub_users) {
		this.sub_users = sub_users;
	}

	/**
	 * @return the printStatus
	 */
	public PrintStatus getPrintStatus() {
		return printStatus;
	}

	/**
	 * @param printStatus the printStatus to set
	 */
	public void setPrintStatus(PrintStatus printStatus) {
		this.printStatus = printStatus;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", base_currency=" + base_currency + ", base_currency_rate=" + base_currency_rate
				+ ", channel_order_number=" + channel_order_number + ", reference_number=" + reference_number
				+ ", order_type=" + order_type + ", export_type=" + export_type + ", sales_person=" + sales_person
				+ ", partially_cancel=" + partially_cancel + ", sub_users=" + sub_users + ", remark=" + remark
				+ ", billing_address=" + billing_address + ", shipping_address=" + shipping_address
				+ ", channel_order_id=" + channel_order_id + ", contact_id=" + contact_id + ", sync_created="
				+ sync_created + ", order_status=" + order_status + ", grand_total=" + grand_total + ", total=" + total
				+ ", store_name=" + store_name + ", is_back_order=" + is_back_order + ", currency=" + currency
				+ ", invoice_created=" + invoice_created + ", payment_method=" + payment_method + ", order_items="
				+ order_items + ", store_id=" + store_id + ", channel_name=" + channel_name + ", purchase_order_links="
				+ purchase_order_links + ", payment_status=" + payment_status + ", custom_status=" + custom_status
				+ ", modified_date=" + modified_date + ", tags=" + tags + ", tax_type=" + tax_type
				+ ", custom_fields_listing=" + custom_fields_listing + ", display_number=" + display_number
				+ ", created_date=" + created_date + ", channel_id=" + channel_id + ", order_extra_items="
				+ order_extra_items + ", warehouse_id=" + warehouse_id + ", delivery_date=" + delivery_date
				+ ", sales_person_id=" + sales_person_id + ", printStatus=" + printStatus + "]";
	}

}
