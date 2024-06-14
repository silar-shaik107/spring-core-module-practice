package com.springboot1;

public class Address {
              private String city;
              private long pincode;
              private String country;
			public Address() {
				super();
				System.out.println("Address classs is created");
			}
			public Address(String city, long pincode, String country) {
				super();
				this.city = city;
				this.pincode = pincode;
				this.country = country;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public long getPincode() {
				return pincode;
			}
			public void setPincode(long pincode) {
				this.pincode = pincode;
			}
			public String getCountry() {
				return country;
			}
			public void setCountry(String country) {
				this.country = country;
			}
              
              
}
