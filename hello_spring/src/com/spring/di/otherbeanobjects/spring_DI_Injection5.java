package com.spring.di.otherbeanobjects;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class spring_DI_Injection5 {

	public static void main(String[] args) {
	BeanFactory factory = new FileSystemXmlApplicationContext(
				"E:\\ADVJAVA530PMBATCH\\hello_spring\\beans5.xml");
		Student student = (Student) factory.getBean("Student1");

		System.out.println(student.getstudentname());
		System.out.println(student.getStduentid());

		Address studentaddress = student.getAddress();

		System.out.println(studentaddress.getCity());
		System.out.println(studentaddress.getPincode());
		System.out.println(studentaddress.getCountry());
		

	}

}
