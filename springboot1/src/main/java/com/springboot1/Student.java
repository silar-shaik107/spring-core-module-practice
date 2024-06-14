package com.springboot1;

public class Student {
             private int studentID;
             private String studentName;
             private long mobileNumber;
             private Address address;
			public Address getAddress() {
				return address;
			}
			public void setAddress(Address address) {
				this.address = address;
			}
			public Student() {
				super();
				System.out.println("Student class is created");
			}
			public int getStudentID() {
				return studentID;
			}
			public void setStudentID(int studentID) {
				this.studentID = studentID;
			}
			public String getStudentName() {
				return studentName;
			}
			public void setStudentName(String studentName) {
				this.studentName = studentName;
			}
			public long getMobileNumber() {
				return mobileNumber;
			}
			public void setMobileNumber(long mobileNumber) {
				this.mobileNumber = mobileNumber;
			}
             
}
