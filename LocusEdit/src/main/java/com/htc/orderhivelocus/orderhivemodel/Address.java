package com.htc.orderhivelocus.orderhivemodel;

/**
 * Represents a Address model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class Address {

	private String country;
	private String address2;
	private String city;
	private String address1;
	private boolean default_customer_address;
	private String contact_number;
	private String zipcode;
	private String country_code;
	
	private String name;
	private String company;
	private String state;
	private String email;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
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
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the default_customer_address
	 */
	public boolean isDefault_customer_address() {
		return default_customer_address;
	}

	/**
	 * @param default_customer_address the default_customer_address to set
	 */
	public void setDefault_customer_address(boolean default_customer_address) {
		this.default_customer_address = default_customer_address;
	}

	/**
	 * @return the contact_number
	 */
	public String getContact_number() {
		return contact_number;
	}

	/**
	 * @param contact_number the contact_number to set
	 */
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the country_code
	 */
	public String getCountry_code() {
		return country_code;
	}

	/**
	 * @param country_code the country_code to set
	 */
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
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
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", address2=" + address2 + ", city=" + city + ", address1=" + address1
				+ ", default_customer_address=" + default_customer_address + ", contact_number=" + contact_number
				+ ", zipcode=" + zipcode + ", country_code=" + country_code + ", name=" + name + ", company=" + company
				+ ", state=" + state + ", email=" + email + "]";
	}

}
