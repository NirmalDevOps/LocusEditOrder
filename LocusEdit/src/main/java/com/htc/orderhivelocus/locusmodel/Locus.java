package com.htc.orderhivelocus.locusmodel;

import java.util.List;
import java.util.Map;

/**
 * Represents a Locus model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class Locus {

	private String clientId;
	private String id;
	private String name;
	private String code;
	private String status;
	private Integer version;
	Map<String, String> customProperties;
	AuditMetadata auditMetadata;
	private String teamId;
	List<LineItems> lineItems;
	List<Skills> skills;
	private String temperatureThreshold;
	CustomFields customFields;
	private String shiftId;
	private String scanId;
	ContactPoint pickupContactPoint;
	LocationAddress pickupLocationAddress;
	LatLng pickupLatLng;
	private String pickupDate;
	List<Slot> pickupSlots;
	private int pickupTransactionDuration;

	PickupAmount pickupAmount;
	private String pickupAppFields;
	private String pickupCustomerId;
	private String pickupAddressId;
	private String dropVisitName;
	private String pickupVisitName;
	private String pickupLocationId;
	
	private String dropLocationId;
	ContactPoint dropContactPoint;
	LocationAddress dropLocationAddress;
	LatLng dropLatLng;
	private String dropDate;
	Slot dropSlot;
	List<Slot> dropSlots;

	private int dropTransactionDuration;
	List<DropAmount> dropAmounts;
	DropAmount dropAmount;
	
	private String dropAppFields;
	private String dropCustomerId;
	private String dropAddressId;
	Volume volume;
	Weight weight;
	private String orderedOn;
	private String createdOn;

	private int sourceOrderId;
	private String taksType;

	private String batchType;
	private String batchId;
	private String planId;
	private String tourId;
	private String sequence;
	private String userId;
	private String homebaseId;
	private String orderStatus;
	private String effectiveStatus;
	private String usecase;

	public Locus() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the version
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
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
	 * @return the auditMetadata
	 */
	public AuditMetadata getAuditMetadata() {
		return auditMetadata;
	}

	/**
	 * @param auditMetadata the auditMetadata to set
	 */
	public void setAuditMetadata(AuditMetadata auditMetadata) {
		this.auditMetadata = auditMetadata;
	}

	/**
	 * @return the teamId
	 */
	public String getTeamId() {
		return teamId;
	}

	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(String teamId) {
		this.teamId = teamId;
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
	public LatLng getPickupLatLng() {
		return pickupLatLng;
	}

	/**
	 * @param pickupLatLng the pickupLatLng to set
	 */
	public void setPickupLatLng(LatLng pickupLatLng) {
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
	 * @return the pickupSlots
	 */
	public List<Slot> getPickupSlots() {
		return pickupSlots;
	}

	/**
	 * @param pickupSlots the pickupSlots to set
	 */
	public void setPickupSlots(List<Slot> pickupSlots) {
		this.pickupSlots = pickupSlots;
	}

	/**
	 * @return the pickupTransactionDuration
	 */
	public int getPickupTransactionDuration() {
		return pickupTransactionDuration;
	}

	/**
	 * @param pickupTransactionDuration the pickupTransactionDuration to set
	 */
	public void setPickupTransactionDuration(int pickupTransactionDuration) {
		this.pickupTransactionDuration = pickupTransactionDuration;
	}

	/**
	 * @return the pickupAmount
	 */
	public PickupAmount getPickupAmount() {
		return pickupAmount;
	}

	/**
	 * @param pickupAmount the pickupAmount to set
	 */
	public void setPickupAmount(PickupAmount pickupAmount) {
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
	public LatLng getDropLatLng() {
		return dropLatLng;
	}

	/**
	 * @param dropLatLng the dropLatLng to set
	 */
	public void setDropLatLng(LatLng dropLatLng) {
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
	public int getDropTransactionDuration() {
		return dropTransactionDuration;
	}

	/**
	 * @param dropTransactionDuration the dropTransactionDuration to set
	 */
	public void setDropTransactionDuration(int dropTransactionDuration) {
		this.dropTransactionDuration = dropTransactionDuration;
	}

	

	/**
	 * @return the dropAmounts
	 */
	public List<DropAmount> getDropAmounts() {
		return dropAmounts;
	}


	/**
	 * @param dropAmounts the dropAmounts to set
	 */
	public void setDropAmounts(List<DropAmount> dropAmounts) {
		this.dropAmounts = dropAmounts;
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

	/**
	 * @return the sourceOrderId
	 */
	public int getSourceOrderId() {
		return sourceOrderId;
	}

	/**
	 * @param sourceOrderId the sourceOrderId to set
	 */
	public void setSourceOrderId(int sourceOrderId) {
		this.sourceOrderId = sourceOrderId;
	}

	/**
	 * @return the taksType
	 */
	public String getTaksType() {
		return taksType;
	}

	/**
	 * @param taksType the taksType to set
	 */
	public void setTaksType(String taksType) {
		this.taksType = taksType;
	}

	/**
	 * @return the batchType
	 */
	public String getBatchType() {
		return batchType;
	}

	/**
	 * @param batchType the batchType to set
	 */
	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	/**
	 * @return the batchId
	 */
	public String getBatchId() {
		return batchId;
	}

	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	/**
	 * @return the planId
	 */
	public String getPlanId() {
		return planId;
	}

	/**
	 * @param planId the planId to set
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	/**
	 * @return the tourId
	 */
	public String getTourId() {
		return tourId;
	}

	/**
	 * @param tourId the tourId to set
	 */
	public void setTourId(String tourId) {
		this.tourId = tourId;
	}

	/**
	 * @return the sequence
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the homebaseId
	 */
	public String getHomebaseId() {
		return homebaseId;
	}

	/**
	 * @param homebaseId the homebaseId to set
	 */
	public void setHomebaseId(String homebaseId) {
		this.homebaseId = homebaseId;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the effectiveStatus
	 */
	public String getEffectiveStatus() {
		return effectiveStatus;
	}

	/**
	 * @param effectiveStatus the effectiveStatus to set
	 */
	public void setEffectiveStatus(String effectiveStatus) {
		this.effectiveStatus = effectiveStatus;
	}

	/**
	 * @return the usecase
	 */
	public String getUsecase() {
		return usecase;
	}

	/**
	 * @param usecase the usecase to set
	 */
	public void setUsecase(String usecase) {
		this.usecase = usecase;
	}
	
	

	
}
