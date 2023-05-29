package com.jsp.HasARelationShip;

public class Address {
	private String street_name;
	private String locality;
	private String state;
	private String city;

	public Address(String street_name, String locality, String state, String city) {
		this.street_name = street_name;
		this.locality = locality;
		this.state = state;
		this.city = city;

	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void printAddress() {
		System.out.println("========Address=========");
	System.out.println("The Street Name is:"+ street_name);
	System.out.println("The Locality is:"+ locality);
	System.out.println(" The State of the Author is:"+ state);
	System.out.println("City of the Author is:"+ city);
	}

}
