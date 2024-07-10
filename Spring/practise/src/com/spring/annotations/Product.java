package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private int id;
	
	public Product() {
		System.out.println("Product is intantiated.....");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
