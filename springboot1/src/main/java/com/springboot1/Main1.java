package com.springboot1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans1.xml");
	        
		System.out.println("*******student1 details*******"); 
		       Student student1=(Student) context.getBean("silar");
	           System.out.println(student1.getStudentID());
	           System.out.println(student1.getStudentName());
	           System.out.println(student1.getMobileNumber());
	          
	       	System.out.println("*******student2 details*******");
	           Student student2=(Student) context.getBean("narsi");
	           System.out.println(student2.getStudentID());
	           System.out.println(student2.getStudentName());
	           System.out.println(student2.getMobileNumber());
	       	System.out.println("*******Address1 details*******");
	           Address address1=(Address) context.getBean("home1");
	           System.out.println(address1.getCity());
	           System.out.println(address1.getPincode());
	           System.out.println(address1.getCountry());
	       	System.out.println("*******Adress2 details*******");
	           Address address2=(Address) context.getBean("home2");
	           System.out.println(address2.getCity());
	           System.out.println(address2.getPincode());
	           System.out.println(address2.getCountry());

	}

}
