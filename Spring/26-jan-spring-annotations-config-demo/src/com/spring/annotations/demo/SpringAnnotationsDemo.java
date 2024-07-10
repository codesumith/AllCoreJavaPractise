package com.spring.annotations.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext container = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		
		Product p1 = (Product) container.getBean("product1");
		System.out.println(p1);
		
		Product p2 = (Product) container.getBean("product2");
		System.out.println(p2);
		
		Order order =(Order) container.getBean("order1");
		System.out.println(order);
		System.out.println(order.getOrderId());
		System.out.println(order.getNoOfItems());
		System.out.println(order.getAmount());

		Product p3 = (Product) container.getBean("product3");
		System.out.println(p3);

	}

}
