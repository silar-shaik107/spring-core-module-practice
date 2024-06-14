package com.springboot.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String streetName;
	private int pincode;
	
	public Address() {
		System.out.println("Address is created");
	}
	

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
