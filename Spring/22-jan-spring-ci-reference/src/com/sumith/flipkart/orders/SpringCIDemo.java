package com.sumith.flipkart.orders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringCIDemo {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-beansci.xml");
		
		Order order1 = (Order) context.getBean("order1");
		System.out.println(order1);
		
		Order order2 = (Order) context.getBean("order2");
		System.out.println(order2);
		
		Order order3 = (Order) context.getBean("order3");
		System.out.println(order3);
		
		Order order4 = (Order) context.getBean("order4");
		System.out.println(order4);
		
	}

}
