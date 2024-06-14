package com.spring.example.di.si.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\ADVJAVA530PMBATCH\\hello_spring1\\beans-ex-si-ci.xml");

		System.out.println("*****Student********");

		Student student = (Student) context.getBean("student");
		System.out.println(student.getStudentid());
		System.out.println(student.getStudentName());
		System.out.println(student.getCollegeName());

		System.out.println("*****Student1********");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1.getStudentid());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getCollegeName());

		System.out.println("*****Address********");

		Address address = (Address) context.getBean("address");
		System.out.println(address.getPincode());
		System.out.println(address.getCity());
		System.out.println(address.getCountry());

		System.out.println("******Student and Address*****");

		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2.getStudentid());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getCollegeName());
		System.out.println(student2.getAddress().getCity());
		System.out.println(student2.getAddress().getCountry());
		System.out.println(student2.getAddress().getPincode());
		
		System.out.println("******Student3 and Address*****");

		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3.getStudentid());
		System.out.println(student3.getStudentName());
		System.out.println(student3.getCollegeName());
		System.out.println(student3.getAddress().getCity());
		System.out.println(student3.getAddress().getCountry());
		System.out.println(student3.getAddress().getPincode());
		
		System.out.println("*****Employee and Address***");
		Employee employee1=(Employee)context.getBean("employe");
		System.out.println(employee1.getEmpId());
		System.out.println(employee1.getEmpName());
		System.out.println(employee1.getEmpSalary());
		System.out.println(employee1.getAddress().getCity());
		System.out.println(employee1.getAddress().getCountry());
		System.out.println(employee1.getAddress().getPincode());
		
		System.out.println("*********Product************");
		Product product=(Product) context.getBean("product");
		System.out.println(product.getProductId());
		System.out.println(product.getProductName());
		System.out.println(product.getPhoneNumber());
		System.out.println(product.getProductItems());
		System.out.println(product.getisOrderSuccess());
	}

}
