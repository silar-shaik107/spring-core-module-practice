package com.springboot.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springboot.cofig.Student;

public class MainComponent {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(springbeancomponentconfig.class);
		Employee emp =(Employee)context.getBean("employee");
		System.out.println(emp);
		Employee emp1=(Employee) context.getBean("emp1");
		System.out.println(emp1);
		Hostel hostel=(Hostel)context.getBean("hostelone");
		System.out.println(hostel);
		
		//imported from another package
		//by using @ComponentScan(basepackage{"",""})
		Student stu=(Student)context.getBean("silar");
		System.out.println(stu);
	}

}
