package com.spring.di.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class springConstructorInjection {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\ADVJAVA530PMBATCH\\hello_spring1\\beans-ci.xml");
		
		System.out.println("*********Product1**********");
		Product product1 = (Product) context.getBean("iphone");
		System.out.println(product1.getProductId());
		System.out.println(product1.getProductName());
		System.out.println(product1.getPrice());
		
		System.out.println("*********Product2**********");
		Product product2=(Product)context.getBean("Realmi");
		System.out.println(product2.getProductId());
		System.out.println(product2.getProductName());
		System.out.println(product2.getPrice());
		
		System.out.println("******Account Details with Address*****");
		AccountDetails accountdeatils=(AccountDetails)context.getBean("accountdetails");
		System.out.println(accountdeatils.getName());
		System.out.println(accountdeatils.getBalance());
		System.out.println(accountdeatils.getMobile());
		System.out.println(accountdeatils.getCostumerAddress().getHouseName());
		System.out.println(accountdeatils.getCostumerAddress().getFlatNo());
		System.out.println(accountdeatils.getCostumerAddress().getMobileNumber());
	}

}
