package com.maven.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.*");
		container.refresh();
		
		Order o = (Order) container.getBean("order");
		System.out.println(o.getoId());
		System.out.println(o.getPrice());
		System.out.println(o.getTransaction().isOrderSuccesfull());

		
	}

}
