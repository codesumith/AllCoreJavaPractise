package com.flipkart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDiOfSetters {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("spring-beans.xml");
		
		Product product1 =(Product) context.getBean("product1");
		
		System.out.println(product1.getId());
		System.out.println(product1.getProductName());
		System.out.println(product1.getPrice()+"\n");
		
	
		System.out.println("Second product details.....");
		
		Product p2=(Product) context.getBean("product2");
		
		p2.setId(8888);
		
		System.out.println(p2.getId());
		System.out.println(p2.getProductName());
		System.out.println(p2.getPrice()+"\n");
		
		System.out.println("Order data");
		
		Order order=(Order) context.getBean("order1");
		
		System.out.println(order);
		
		order.getFoodItemNames().stream().forEach(item -> System.out.println(item));
		
		Practise p1 = (Practise) context.getBean("p1");
		
		p1.getItems().stream().forEach(item -> System.out.print(item+" "));
		
		

		
	}

}
