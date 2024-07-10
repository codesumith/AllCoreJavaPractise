package com.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotations {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container = 
			new	AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Product p1 = (Product) container.getBean("product");
		System.out.println(p1);
		System.out.println(p1.getId());
		
		Product p2 = (Product) container.getBean("p");
		System.out.println(p2);
		System.out.println(p2.getId());
	}

}
