package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a LocationAddress model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class LocationAddress {

	private String id;
	private String placeName;
	private String localityName;
	private String formattedAddress;
	private String subLocalityName;
	private String pincode;
	private String city;
	private String state;
	private String countryCode;
	private String locationType;
	private String placeHash;

	public LocationAddress() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the placeName
	 */
	public String getPlaceName() {
		return placeName;
	}

	/**
	 * @param placeName the placeName to set
	 */
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	/**
	 * @return the localityName
	 */
	public String getLocalityName() {
		return localityName;
	}

	/**
	 * @param localityName the localityName to set
	 */
	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}

	/**
	 * @return the formattedAddress
	 */
	public String getFormattedAddress() {
		return formattedAddress;
	}

	/**
	 * @param formattedAddress the formattedAddress to set
	 */
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	/**
	 * @return the subLocalityName
	 */
	public String getSubLocalityName() {
		return subLocalityName;
	}

	/**
	 * @param subLocalityName the subLocalityName to set
	 */
	public void setSubLocalityName(String subLocalityName) {
		this.subLocalityName = subLocalityName;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the locationType
	 */
	public String getLocationType() {
		return locationType;
	}

	/**
	 * @param locationType the locationType to set
	 */
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	/**
	 * @return the placeHash
	 */
	public String getPlaceHash() {
		return placeHash;
	}

	/**
	 * @param placeHash the placeHash to set
	 */
	public void setPlaceHash(String placeHash) {
		this.placeHash = placeHash;
	}

	@Override
	public String toString() {
		return "LocationAddress [id=" + id + ", placeName=" + placeName + ", localityName=" + localityName
				+ ", formattedAddress=" + formattedAddress + ", subLocalityName=" + subLocalityName + ", pincode="
				+ pincode + ", city=" + city + ", state=" + state + ", countryCode=" + countryCode + ", locationType="
				+ locationType + ", placeHash=" + placeHash + "]";
	}

}
