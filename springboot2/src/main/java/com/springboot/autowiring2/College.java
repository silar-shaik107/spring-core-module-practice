package com.springboot.autowiring2;

import org.springframework.stereotype.Component;

@Component
public class College {
            private int studentId;
            private String studentName;
            private long phoneNumber;
            private Address address;
            
            public College() {
            	System.out.println("College is created");
            }

			public int getStudentId() {
				return studentId;
			}

			public void setStudentId(int studentId) {
				this.studentId = studentId;
			}

			public String getStudentName() {
				return studentName;
			}

			public void setStudentName(String studentName) {
				this.studentName = studentName;
			}

			public long getPhoneNumber() {
				return phoneNumber;
			}

			public void setPhoneNumber(long phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public Address getAddress() {
				return address;
			}

			public void setAddress(Address address) {
				this.address = address;
			}
			         
}
