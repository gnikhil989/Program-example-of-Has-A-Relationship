package com.jsp.HasARelationShip;

public class Author {
	private String name;
	private String email;
	private long number;
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Author(String name,String email,long number) {
		this.name=name;
		this.email=email;
		this.number=number;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	public void printAuthorDetails() {
		System.out.println("======= Author==========");
		System.out.println("Nmae of the Authoir is:"+ name);
		System.out.println("Email of the Author is:" + email);
		if(address!= null) {
			address.printAddress();
		}
		else {
			System.out.println("No address is Provided");
		}
	}
}
