package com.springboot.component;

import org.springframework.stereotype.Component;
// if we provide Bean Id at @Component that should be used
//Otherwise the method name should be taken as Bean Id i.e 1st letter
//should in small case(Hostel==>hostel)
@Component("hostelone")
public class Hostel {
	private String name;
	private long phoneNumber;
	private double hostelFee;
	
	public Hostel() {
		System.out.println("Hostel is created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}

}
