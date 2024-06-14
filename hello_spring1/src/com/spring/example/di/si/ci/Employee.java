package com.spring.example.di.si.ci;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private Address address;

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

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
