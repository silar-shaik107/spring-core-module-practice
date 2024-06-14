package com.springboot.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(springbeanconfiguration.class);
        context.refresh();
        // when we have only one Bean object .class is passed as a parameter 
        //here component produces a one Bean object
        //we have multiple Bean object then bean id should be passed
         Address address=context.getBean(Address.class);
         System.out.println(address);
        
         Account account1=context.getBean(Account.class);
         System.out.println(account1);
         
         Employee employee1=context.getBean(Employee.class);
         System.out.println(employee1);
	}
}


