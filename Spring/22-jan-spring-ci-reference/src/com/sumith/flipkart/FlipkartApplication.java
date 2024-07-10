package com.sumith.flipkart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FlipkartApplication {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context =new FileSystemXmlApplicationContext("Spring-beans.xml");
		
		ProductDetails p1 = (ProductDetails) context.getBean("product2");
		System.out.println(p1);
		System.out.println(p1.getName());
		System.out.println(p1.getProductId());
		
		OrderDetails orderDetails = (OrderDetails) context.getBean("order2"); 
		
		System.out.println(orderDetails.getOrderId());
		System.out.println(orderDetails.getAmount());
		System.out.println(orderDetails.getPd());
		System.out.println(orderDetails.getPd().getName());
		
		
		FlipkartOrder flipkartApplication = (FlipkartOrder) context.getBean("flipkartOrder1");
		System.out.println(flipkartApplication);


		
	}

}
