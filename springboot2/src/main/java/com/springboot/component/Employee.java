package com.springboot.component;

import org.springframework.stereotype.Component;
// here we did not provide a Bean id so,it should take Bean Id 
//as (employee)
@Component
public class Employee {
           private int employeeId;
           private String employeeName;
           private double employeeSalary;
           
          public Employee() {
        	  System.out.println("Employee is created");
          }
           
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public double getEmployeeSalary() {
			return employeeSalary;
		}
		public void setEmployeeSalary(double employeeSalary) {
			this.employeeSalary = employeeSalary;
		}
           
}
