package com.springboot.cofig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class springbootmain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SpringBeanConfiguaration.class);
        
		/*By using register 
		context.register(SpringBeanConfiguaration.class);
		 context.register(AnotherBeanConfiguration.class)
		context.refresh();
		context.close();*/
       
		Student std1= (Student) context.getBean("silar");
        System.out.println(std1);
        System.out.println(std1.getStduentId());
        System.out.println(std1.getStudentName());
        System.out.println(std1.getStudentNumber());
     
        Student std2=  (Student)context.getBean("getStudent2");
        System.out.println(std2);
        
        Address address1=(Address)context.getBean("add1");
        System.out.println(address1);
        
        Address address2=(Address)context.getBean("getAddress2");
        System.out.println(address2);
		
        
	}

}
