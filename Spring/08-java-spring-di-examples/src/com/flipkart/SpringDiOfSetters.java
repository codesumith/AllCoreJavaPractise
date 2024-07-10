package com.flipkart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDiOfSetters {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-beans.xml");
		
		Product product =(Product)context.getBean("product1");
	
		System.out.println(product.getId());
		System.out.println(product.getProductName());
		System.out.println(product.getPrice());

		product.setId(2);
		
		
		System.out.println(product.getId());
		System.out.println(product.getProductName());
		System.out.println(product.getPrice());
		
		
	}

}
