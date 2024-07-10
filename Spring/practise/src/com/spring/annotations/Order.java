package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class Order {

	private String item;
	
	public Order() {
		System.out.println("Order is instantiated..");
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	

}
