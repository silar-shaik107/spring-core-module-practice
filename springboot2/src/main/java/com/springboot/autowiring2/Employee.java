package com.springboot.autowiring2;

import org.springframework.stereotype.Component;

@Component
public class Employee {
               private int empId;
               private String empName;
               private String emailId;
               private Address address;
               
               public Employee() {
            	   System.out.println("Employee is craeted");
               }

			public int getEmpId() {
				return empId;
			}

			public void setEmpId(int empId) {
				this.empId = empId;
			}

			public String getEmpName() {
				return empName;
			}

			public void setEmpName(String empName) {
				this.empName = empName;
			}

			public String getEmailId() {
				return emailId;
			}

			public void setEmailId(String emailId) {
				this.emailId = emailId;
			}

			public Address getAddress() {
				return address;
			}

			public void setAddress(Address address) {
				this.address = address;
			}
               
}
