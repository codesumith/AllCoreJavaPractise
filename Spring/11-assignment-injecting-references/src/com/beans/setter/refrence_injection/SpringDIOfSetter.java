package com.beans.setter.refrence_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDIOfSetter {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-beans.xml");
		
		Product p =(Product) context.getBean("product1");
		System.out.println(p);
		System.out.println(p.getName());
		System.out.println(p.getYearOfExpiry());
		System.out.println(p.getPrice());
		
		
		System.out.println("\nOrder Details...\n");
		
		Order od =(Order) context.getBean("order1");
		
		System.out.println(od.getProduct());
		System.out.println(od.getProduct().getName());
		System.out.println(od.getProduct().getYearOfExpiry());
		System.out.println(od.getProduct().getPrice());
		System.out.println(od.getOrderId());
		System.out.println(od.getOrderAmount());

	}

}
