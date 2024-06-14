package com.springboot.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguaration {
	
	
	
	@Bean("silar")
   Student getStudent1() {
		Student s=new Student();
		s.setStduentId(101);
		s.setStudentName("shaik mohammad silar");
		s.setStudentNumber("9866248875");
    	return new Student();
   }
	//if we doesn't provide any Bean Id,then method name should be taken as Bean id 
	//for this Bean Method "getstudent2" is the Bean id
    @Bean
    Student getStudent2() {
   	return new Student();
    }

	@Bean("add1")
	Address getAddress1() {
		return new Address();
		}
	@Bean
	Address getAddress2() {
		return new Address();
	}
}
