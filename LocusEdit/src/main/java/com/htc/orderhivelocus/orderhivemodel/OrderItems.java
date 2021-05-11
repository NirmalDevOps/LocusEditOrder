package com.htc.orderhivelocus.orderhivemodel;

import java.util.List;

/**
 * Represents a OrderItems model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class OrderItems {

	private Long id;
	private String name;
	private String sku;
	private String note;
	private Long item_id;
	private Long quantity_cancelled;
	private String barcode;
	private Long asin_number;
	private Long quantity_shipped;
	private Long quantity_available;
	private Long quantity_on_hand;
	private Long item_warehouse;
	private Long quantity_returned;
	private Long quantity_invoiced;
	private Long quantity_ordered;
	private Long quantity_delivered;
	private Long quantity_packed;
	private Long quantity_dropshipped;
	private Long tax_value;
	private Long tax_percent;
	private Long row_total;
	private Long price;
	private Long discount_percent;
	private Long discount_value;
	private Long weight;
	private String weight_unit;
	private Long volume;
	private String volume_unit;
	private String discount_type;
	private Long channel_primary_id;
	private Long channel_secondary_id;

	Suppliers suppliers;
	List<MetaData> metaData;

	public OrderItems() {
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

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the item_id
	 */
	public Long getItem_id() {
		return item_id;
	}

	/**
	 * @param item_id the item_id to set
	 */
	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	/**
	 * @return the quantity_cancelled
	 */
	public Long getQuantity_cancelled() {
		return quantity_cancelled;
	}

	/**
	 * @param quantity_cancelled the quantity_cancelled to set
	 */
	public void setQuantity_cancelled(Long quantity_cancelled) {
		this.quantity_cancelled = quantity_cancelled;
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
	 * @return the asin_number
	 */
	public Long getAsin_number() {
		return asin_number;
	}

	/**
	 * @param asin_number the asin_number to set
	 */
	public void setAsin_number(Long asin_number) {
		this.asin_number = asin_number;
	}

	/**
	 * @return the quantity_shipped
	 */
	public Long getQuantity_shipped() {
		return quantity_shipped;
	}

	/**
	 * @param quantity_shipped the quantity_shipped to set
	 */
	public void setQuantity_shipped(Long quantity_shipped) {
		this.quantity_shipped = quantity_shipped;
	}

	/**
	 * @return the quantity_available
	 */
	public Long getQuantity_available() {
		return quantity_available;
	}

	/**
	 * @param quantity_available the quantity_available to set
	 */
	public void setQuantity_available(Long quantity_available) {
		this.quantity_available = quantity_available;
	}

	/**
	 * @return the quantity_on_hand
	 */
	public Long getQuantity_on_hand() {
		return quantity_on_hand;
	}

	/**
	 * @param quantity_on_hand the quantity_on_hand to set
	 */
	public void setQuantity_on_hand(Long quantity_on_hand) {
		this.quantity_on_hand = quantity_on_hand;
	}

	/**
	 * @return the item_warehouse
	 */
	public Long getItem_warehouse() {
		return item_warehouse;
	}

	/**
	 * @param item_warehouse the item_warehouse to set
	 */
	public void setItem_warehouse(Long item_warehouse) {
		this.item_warehouse = item_warehouse;
	}

	/**
	 * @return the quantity_returned
	 */
	public Long getQuantity_returned() {
		return quantity_returned;
	}

	/**
	 * @param quantity_returned the quantity_returned to set
	 */
	public void setQuantity_returned(Long quantity_returned) {
		this.quantity_returned = quantity_returned;
	}

	/**
	 * @return the quantity_invoiced
	 */
	public Long getQuantity_invoiced() {
		return quantity_invoiced;
	}

	/**
	 * @param quantity_invoiced the quantity_invoiced to set
	 */
	public void setQuantity_invoiced(Long quantity_invoiced) {
		this.quantity_invoiced = quantity_invoiced;
	}

	/**
	 * @return the quantity_ordered
	 */
	public Long getQuantity_ordered() {
		return quantity_ordered;
	}

	/**
	 * @param quantity_ordered the quantity_ordered to set
	 */
	public void setQuantity_ordered(Long quantity_ordered) {
		this.quantity_ordered = quantity_ordered;
	}

	/**
	 * @return the quantity_delivered
	 */
	public Long getQuantity_delivered() {
		return quantity_delivered;
	}

	/**
	 * @param quantity_delivered the quantity_delivered to set
	 */
	public void setQuantity_delivered(Long quantity_delivered) {
		this.quantity_delivered = quantity_delivered;
	}

	/**
	 * @return the quantity_packed
	 */
	public Long getQuantity_packed() {
		return quantity_packed;
	}

	/**
	 * @param quantity_packed the quantity_packed to set
	 */
	public void setQuantity_packed(Long quantity_packed) {
		this.quantity_packed = quantity_packed;
	}

	/**
	 * @return the quantity_dropshipped
	 */
	public Long getQuantity_dropshipped() {
		return quantity_dropshipped;
	}

	/**
	 * @param quantity_dropshipped the quantity_dropshipped to set
	 */
	public void setQuantity_dropshipped(Long quantity_dropshipped) {
		this.quantity_dropshipped = quantity_dropshipped;
	}

	/**
	 * @return the tax_value
	 */
	public Long getTax_value() {
		return tax_value;
	}

	/**
	 * @param tax_value the tax_value to set
	 */
	public void setTax_value(Long tax_value) {
		this.tax_value = tax_value;
	}

	/**
	 * @return the tax_percent
	 */
	public Long getTax_percent() {
		return tax_percent;
	}

	/**
	 * @param tax_percent the tax_percent to set
	 */
	public void setTax_percent(Long tax_percent) {
		this.tax_percent = tax_percent;
	}

	/**
	 * @return the row_total
	 */
	public Long getRow_total() {
		return row_total;
	}

	/**
	 * @param row_total the row_total to set
	 */
	public void setRow_total(Long row_total) {
		this.row_total = row_total;
	}

	/**
	 * @return the price
	 */
	public Long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Long price) {
		this.price = price;
	}

	/**
	 * @return the discount_percent
	 */
	public Long getDiscount_percent() {
		return discount_percent;
	}

	/**
	 * @param discount_percent the discount_percent to set
	 */
	public void setDiscount_percent(Long discount_percent) {
		this.discount_percent = discount_percent;
	}

	/**
	 * @return the discount_value
	 */
	public Long getDiscount_value() {
		return discount_value;
	}

	/**
	 * @param discount_value the discount_value to set
	 */
	public void setDiscount_value(Long discount_value) {
		this.discount_value = discount_value;
	}

	/**
	 * @return the discount_type
	 */
	public String getDiscount_type() {
		return discount_type;
	}

	/**
	 * @param discount_type the discount_type to set
	 */
	public void setDiscount_type(String discount_type) {
		this.discount_type = discount_type;
	}

	/**
	 * @return the channel_primary_id
	 */
	public Long getChannel_primary_id() {
		return channel_primary_id;
	}

	/**
	 * @param channel_primary_id the channel_primary_id to set
	 */
	public void setChannel_primary_id(Long channel_primary_id) {
		this.channel_primary_id = channel_primary_id;
	}

	/**
	 * @return the channel_secondary_id
	 */
	public Long getChannel_secondary_id() {
		return channel_secondary_id;
	}

	/**
	 * @param channel_secondary_id the channel_secondary_id to set
	 */
	public void setChannel_secondary_id(Long channel_secondary_id) {
		this.channel_secondary_id = channel_secondary_id;
	}

	/**
	 * @return the suppliers
	 */
	public Suppliers getSuppliers() {
		return suppliers;
	}

	/**
	 * @param suppliers the suppliers to set
	 */
	public void setSuppliers(Suppliers suppliers) {
		this.suppliers = suppliers;
	}

	/**
	 * @return the metaData
	 */
	public List<MetaData> getMetaData() {
		return metaData;
	}

	/**
	 * @param metaData the metaData to set
	 */
	public void setMetaData(List<MetaData> metaData) {
		this.metaData = metaData;
	}
	

	/**
	 * @return the weight
	 */
	public Long getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Long weight) {
		this.weight = weight;
	}

	/**
	 * @return the weight_unit
	 */
	public String getWeight_unit() {
		return weight_unit;
	}

	/**
	 * @param weight_unit the weight_unit to set
	 */
	public void setWeight_unit(String weight_unit) {
		this.weight_unit = weight_unit;
	}

	/**
	 * @return the volume
	 */
	public Long getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	/**
	 * @return the volume_unit
	 */
	public String getVolume_unit() {
		return volume_unit;
	}

	/**
	 * @param volume_unit the volume_unit to set
	 */
	public void setVolume_unit(String volume_unit) {
		this.volume_unit = volume_unit;
	}
	

	
}
