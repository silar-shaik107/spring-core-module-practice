package com.springboot.autowiring2;

import org.springframework.stereotype.Component;

@Component
public class Address {
	         private String city;
	         private int pincode;
	        public Address() {
	        	System.out.println("Address is created");
	        }
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public int getPincode() {
				return pincode;
			}
			public void setPincode(int pincode) {
				this.pincode = pincode;
			}
	        

}
