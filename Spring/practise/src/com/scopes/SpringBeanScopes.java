package com.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeanScopes {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext container = new FileSystemXmlApplicationContext("beans.xml");
		
		Product p1 = (Product) container.getBean("product1");
		System.out.println(p1);
		p1.setId(123);
		
		Product p2 = (Product) container.getBean("product1");
		System.out.println(p2);
		System.out.println(p2.getId());
		
		
//		product2
		
		Product p3 = (Product) container.getBean("product2");
		System.out.println(p3);
		p3.setId(345);
		
		
		Product p4 = (Product) container.getBean("product2");
		System.out.println(p4);
		System.out.println(p4.getId());
		
		
	}

}
