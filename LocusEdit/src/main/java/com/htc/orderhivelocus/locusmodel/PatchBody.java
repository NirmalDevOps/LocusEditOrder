/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

import java.util.List;
import java.util.Map;

/**
 * Represents a PatchBody model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class PatchBody {

	//CustomProperties customProperties;
	Map<String, String> customProperties;
	List<LineItems> lineItems;

	List<Skills> skills;
	private String temperatureThreshold;
	CustomFields customFields;
	private String shiftId;
	private String scanId;
	private String pickupVisitName;
	private String pickupLocationId;
	//private String pickupContactPoint;
	//private String pickupLocationAddress;
	private String pickupLatLng;

	private String pickupDate;
	private String pickupSlot;
	List<PickupSlot> pickupSlots;
	private String pickupTransactionDuration;
	private String pickupAmount;
	private String pickupAppFields;
	private String pickupCustomerId;
	private String pickupAddressId;
	private String dropVisitName;
	private String dropLocationId;
	ContactPoint dropContactPoint;
	LocationAddress dropLocationAddress;
	
	ContactPoint pickupContactPoint;
	LocationAddress pickupLocationAddress;
	
	
	
	private String dropLatLng;
	private String dropDate;
	Slot dropSlot;
	List<Slot> dropSlots;
	private Integer dropTransactionDuration;

	DropAmount dropAmount;
	private String exchangeType;
	private String dropAppFields;

	private String dropCustomerId;
	private String dropAddressId;
	private Volume volume;
	private Weight weight;
	private String orderedOn;
	private String createdOn;
	public PatchBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the customProperties
	 */
	public Map<String, String> getCustomProperties() {
		return customProperties;
	}
	
	

	/**
	 * @param customProperties the customProperties to set
	 */
	public void setCustomProperties(Map<String, String> customProperties) {
		this.customProperties = customProperties;
	}

	/**
	 * @return the lineItems
	 */
	public List<LineItems> getLineItems() {
		return lineItems;
	}
	/**
	 * @param lineItems the lineItems to set
	 */
	public void setLineItems(List<LineItems> lineItems) {
		this.lineItems = lineItems;
	}
	
	
	
	/**
	 * @return the skills
	 */
	public List<Skills> getSkills() {
		return skills;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	/**
	 * @return the temperatureThreshold
	 */
	public String getTemperatureThreshold() {
		return temperatureThreshold;
	}
	/**
	 * @param temperatureThreshold the temperatureThreshold to set
	 */
	public void setTemperatureThreshold(String temperatureThreshold) {
		this.temperatureThreshold = temperatureThreshold;
	}
	/**
	 * @return the customFields
	 */
	public CustomFields getCustomFields() {
		return customFields;
	}
	/**
	 * @param customFields the customFields to set
	 */
	public void setCustomFields(CustomFields customFields) {
		this.customFields = customFields;
	}
	/**
	 * @return the shiftId
	 */
	public String getShiftId() {
		return shiftId;
	}
	/**
	 * @param shiftId the shiftId to set
	 */
	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}
	/**
	 * @return the scanId
	 */
	public String getScanId() {
		return scanId;
	}
	/**
	 * @param scanId the scanId to set
	 */
	public void setScanId(String scanId) {
		this.scanId = scanId;
	}
	/**
	 * @return the pickupVisitName
	 */
	public String getPickupVisitName() {
		return pickupVisitName;
	}
	/**
	 * @param pickupVisitName the pickupVisitName to set
	 */
	public void setPickupVisitName(String pickupVisitName) {
		this.pickupVisitName = pickupVisitName;
	}
	/**
	 * @return the pickupLocationId
	 */
	public String getPickupLocationId() {
		return pickupLocationId;
	}
	/**
	 * @param pickupLocationId the pickupLocationId to set
	 */
	public void setPickupLocationId(String pickupLocationId) {
		this.pickupLocationId = pickupLocationId;
	}
	
	
	/**
	 * @return the pickupContactPoint
	 */
	public ContactPoint getPickupContactPoint() {
		return pickupContactPoint;
	}

	/**
	 * @param pickupContactPoint the pickupContactPoint to set
	 */
	public void setPickupContactPoint(ContactPoint pickupContactPoint) {
		this.pickupContactPoint = pickupContactPoint;
	}

	/**
	 * @return the pickupLocationAddress
	 */
	public LocationAddress getPickupLocationAddress() {
		return pickupLocationAddress;
	}

	/**
	 * @param pickupLocationAddress the pickupLocationAddress to set
	 */
	public void setPickupLocationAddress(LocationAddress pickupLocationAddress) {
		this.pickupLocationAddress = pickupLocationAddress;
	}

	/**
	 * @return the pickupLatLng
	 */
	public String getPickupLatLng() {
		return pickupLatLng;
	}
	/**
	 * @param pickupLatLng the pickupLatLng to set
	 */
	public void setPickupLatLng(String pickupLatLng) {
		this.pickupLatLng = pickupLatLng;
	}
	/**
	 * @return the pickupDate
	 */
	public String getPickupDate() {
		return pickupDate;
	}
	/**
	 * @param pickupDate the pickupDate to set
	 */
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}
	/**
	 * @return the pickupSlot
	 */
	public String getPickupSlot() {
		return pickupSlot;
	}
	/**
	 * @param pickupSlot the pickupSlot to set
	 */
	public void setPickupSlot(String pickupSlot) {
		this.pickupSlot = pickupSlot;
	}
	/**
	 * @return the pickupSlots
	 */
	public List<PickupSlot> getPickupSlots() {
		return pickupSlots;
	}
	/**
	 * @param pickupSlots the pickupSlots to set
	 */
	public void setPickupSlots(List<PickupSlot> pickupSlots) {
		this.pickupSlots = pickupSlots;
	}
	/**
	 * @return the pickupTransactionDuration
	 */
	public String getPickupTransactionDuration() {
		return pickupTransactionDuration;
	}
	/**
	 * @param pickupTransactionDuration the pickupTransactionDuration to set
	 */
	public void setPickupTransactionDuration(String pickupTransactionDuration) {
		this.pickupTransactionDuration = pickupTransactionDuration;
	}
	/**
	 * @return the pickupAmount
	 */
	public String getPickupAmount() {
		return pickupAmount;
	}
	/**
	 * @param pickupAmount the pickupAmount to set
	 */
	public void setPickupAmount(String pickupAmount) {
		this.pickupAmount = pickupAmount;
	}
	/**
	 * @return the pickupAppFields
	 */
	public String getPickupAppFields() {
		return pickupAppFields;
	}
	/**
	 * @param pickupAppFields the pickupAppFields to set
	 */
	public void setPickupAppFields(String pickupAppFields) {
		this.pickupAppFields = pickupAppFields;
	}
	/**
	 * @return the pickupCustomerId
	 */
	public String getPickupCustomerId() {
		return pickupCustomerId;
	}
	/**
	 * @param pickupCustomerId the pickupCustomerId to set
	 */
	public void setPickupCustomerId(String pickupCustomerId) {
		this.pickupCustomerId = pickupCustomerId;
	}
	/**
	 * @return the pickupAddressId
	 */
	public String getPickupAddressId() {
		return pickupAddressId;
	}
	/**
	 * @param pickupAddressId the pickupAddressId to set
	 */
	public void setPickupAddressId(String pickupAddressId) {
		this.pickupAddressId = pickupAddressId;
	}
	/**
	 * @return the dropVisitName
	 */
	public String getDropVisitName() {
		return dropVisitName;
	}
	/**
	 * @param dropVisitName the dropVisitName to set
	 */
	public void setDropVisitName(String dropVisitName) {
		this.dropVisitName = dropVisitName;
	}
	/**
	 * @return the dropLocationId
	 */
	public String getDropLocationId() {
		return dropLocationId;
	}
	/**
	 * @param dropLocationId the dropLocationId to set
	 */
	public void setDropLocationId(String dropLocationId) {
		this.dropLocationId = dropLocationId;
	}
	/**
	 * @return the dropContactPoint
	 */
	public ContactPoint getDropContactPoint() {
		return dropContactPoint;
	}
	/**
	 * @param dropContactPoint the dropContactPoint to set
	 */
	public void setDropContactPoint(ContactPoint dropContactPoint) {
		this.dropContactPoint = dropContactPoint;
	}
	/**
	 * @return the pickupLocationAddress
	 */
	public LocationAddress getDropLocationAddress() {
		return dropLocationAddress;
	}
	/**
	 * @param pickupLocationAddress the pickupLocationAddress to set
	 */
	public void setDropLocationAddress(LocationAddress dropLocationAddress) {
		this.dropLocationAddress = dropLocationAddress;
	}
	/**
	 * @return the dropLatLng
	 */
	public String getDropLatLng() {
		return dropLatLng;
	}
	/**
	 * @param dropLatLng the dropLatLng to set
	 */
	public void setDropLatLng(String dropLatLng) {
		this.dropLatLng = dropLatLng;
	}
	/**
	 * @return the dropDate
	 */
	public String getDropDate() {
		return dropDate;
	}
	/**
	 * @param dropDate the dropDate to set
	 */
	public void setDropDate(String dropDate) {
		this.dropDate = dropDate;
	}
	/**
	 * @return the dropSlot
	 */
	public Slot getDropSlot() {
		return dropSlot;
	}
	/**
	 * @param dropSlot the dropSlot to set
	 */
	public void setDropSlot(Slot dropSlot) {
		this.dropSlot = dropSlot;
	}
	/**
	 * @return the dropSlots
	 */
	public List<Slot> getDropSlots() {
		return dropSlots;
	}
	/**
	 * @param dropSlots the dropSlots to set
	 */
	public void setDropSlots(List<Slot> dropSlots) {
		this.dropSlots = dropSlots;
	}
	/**
	 * @return the dropTransactionDuration
	 */
	public Integer getDropTransactionDuration() {
		return dropTransactionDuration;
	}
	/**
	 * @param dropTransactionDuration the dropTransactionDuration to set
	 */
	public void setDropTransactionDuration(Integer dropTransactionDuration) {
		this.dropTransactionDuration = dropTransactionDuration;
	}
	/**
	 * @return the dropAmount
	 */
	public DropAmount getDropAmount() {
		return dropAmount;
	}
	/**
	 * @param dropAmount the dropAmount to set
	 */
	public void setDropAmount(DropAmount dropAmount) {
		this.dropAmount = dropAmount;
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
	/**
	 * @return the dropAppFields
	 */
	public String getDropAppFields() {
		return dropAppFields;
	}
	/**
	 * @param dropAppFields the dropAppFields to set
	 */
	public void setDropAppFields(String dropAppFields) {
		this.dropAppFields = dropAppFields;
	}
	/**
	 * @return the dropCustomerId
	 */
	public String getDropCustomerId() {
		return dropCustomerId;
	}
	/**
	 * @param dropCustomerId the dropCustomerId to set
	 */
	public void setDropCustomerId(String dropCustomerId) {
		this.dropCustomerId = dropCustomerId;
	}
	/**
	 * @return the dropAddressId
	 */
	public String getDropAddressId() {
		return dropAddressId;
	}
	/**
	 * @param dropAddressId the dropAddressId to set
	 */
	public void setDropAddressId(String dropAddressId) {
		this.dropAddressId = dropAddressId;
	}
	
	/**
	 * @return the volume
	 */
	public Volume getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(Volume volume) {
		this.volume = volume;
	}
	/**
	 * @return the weight
	 */
	public Weight getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Weight weight) {
		this.weight = weight;
	}
	/**
	 * @return the orderedOn
	 */
	public String getOrderedOn() {
		return orderedOn;
	}
	/**
	 * @param orderedOn the orderedOn to set
	 */
	public void setOrderedOn(String orderedOn) {
		this.orderedOn = orderedOn;
	}
	/**
	 * @return the createdOn
	 */
	public String getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	


}
