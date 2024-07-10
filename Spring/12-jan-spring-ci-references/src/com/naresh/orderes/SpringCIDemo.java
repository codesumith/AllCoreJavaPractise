package com.naresh.orderes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringCIDemo {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-beans.xml");

		Order order = (Order) context.getBean("order1");
		System.out.println(order);
		
		Order order2 = (Order) context.getBean("order2");
		System.out.println(order2);
		
	}

}
