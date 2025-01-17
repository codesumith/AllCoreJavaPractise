package com.sumith.order;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringComponentDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//solution 1
		//while creating container passed config data 
		
//      AnnotationConfigApplicationContext container =
//    		  new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
      
		/*
		//Solution 2 
		//After created container passed config
		
		 AnnotationConfigApplicationContext container =
	    		  new AnnotationConfigApplicationContext();
		 
		 //registering configuration classes
		 container.register(SpringBeanConfiguration.class);
		 
		 //now process configuration class and create bean objects
         container.refresh();
         */
		
		//3 rd approach
		AnnotationConfigApplicationContext container =
		  new AnnotationConfigApplicationContext();
		container.scan("com.*");
		container.refresh();

      Order o1 = (Order) container.getBean("createOrderOne");
      System.out.println(o1);
      System.out.println(o1.getoId());
      System.out.println(o1.getPrice());


	}

}
