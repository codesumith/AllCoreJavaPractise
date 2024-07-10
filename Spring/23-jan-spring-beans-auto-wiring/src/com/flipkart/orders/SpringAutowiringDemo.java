package com.flipkart.orders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAutowiringDemo {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext container = new FileSystemXmlApplicationContext("beans.xml");
		
		Order order = (Order) container.getBean("order1");
		System.out.println(order.getProduct());
		System.out.println(order.getTransaction());

		
	}

}
