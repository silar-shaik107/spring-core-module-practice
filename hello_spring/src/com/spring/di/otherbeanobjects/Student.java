package com.spring.di.otherbeanobjects;

public class Student {
	private String studentname;
	private int stduentid;
	private Address address;
	
	public String getstudentname() {
		return studentname;
	}
	public void setstudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStduentid() {
		return stduentid;
	}
	public void setStduentid(int stduentid) {
		this.stduentid = stduentid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
