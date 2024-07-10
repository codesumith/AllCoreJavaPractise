package com.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("order1")
public class Order {
	
	private int oid;
	private String userName;
	
	
	@Autowired
	private Product product;

	public Order() {
		System.out.println("Order is created...");
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		System.out.println("prod setter invoked");
		this.product = product;
	}
	
	

}
