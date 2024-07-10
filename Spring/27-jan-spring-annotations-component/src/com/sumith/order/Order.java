package com.sumith.order;

import org.springframework.stereotype.Component;

@Component("order1")
public class Order {

	private int oId;
	private Double price;
	
	public Order() {
		System.out.println("Order is instantiated..");
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	
}