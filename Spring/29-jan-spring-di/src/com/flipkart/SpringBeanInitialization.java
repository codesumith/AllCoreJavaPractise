package com.flipkart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanInitialization {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext springContainer = 
				new AnnotationConfigApplicationContext();
		springContainer.scan("com.*");
		springContainer.refresh();
		
		Order o1 = springContainer.getBean(Order.class);
	   System.out.println(o1);
	   System.out.println(o1.getProduct());
	  
	   
		
		
	}

}
