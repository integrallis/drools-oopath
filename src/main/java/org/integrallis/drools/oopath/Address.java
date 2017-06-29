package org.integrallis.drools.oopath;

public class Address {

	private String street;
	private String number;
	private String city;
	private String zip;
	private String state;

	public Address(String number, String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.number = number;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String toString() {
		return number + " " + street + ", " + city + " " + state + " " + zip;
	}

}
