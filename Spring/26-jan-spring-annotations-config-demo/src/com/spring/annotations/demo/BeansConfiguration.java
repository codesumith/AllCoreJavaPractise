package com.spring.annotations.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeansConfiguration {
	
	//Bean Id
	@Bean("product1")
	public Product getProduct()
	{
		System.out.println("In get product method..");
		Product product = new Product();
		return product;
	}
	
	@Bean("product2")
	public Product getProductTwo()
	{
		System.out.println("In get productTwo method..");
		Product product = new Product();
		return product;
	}

	@Bean("product3")
	public Product getProductThree()
	{
		System.out.println("In get productThree method..");
		Product p = new Product();
		return p;
	}
	
	@Bean("order1")
	public Order getOrder()
	{
		System.out.println("In get order method..");
		Order order =new Order();
		order.setOrderId("123");
		order.setNoOfItems(2);
		order.setAmount(2000.0);
		return order;
	}
}
