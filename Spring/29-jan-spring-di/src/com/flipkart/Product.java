package com.flipkart;

import org.springframework.stereotype.Component;

@Component
public class Product {

	
	@SuppressWarnings("unused")
	private int pid;
	
	public Product() {
		System.out.println("Product is instantiated...");
	}

	

}
