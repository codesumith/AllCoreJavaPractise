package com.sumith.nov11test;

public class Product {
	
	String name;
	int expirydate;
	
	public Product(String name, int expirydate) {
		super();
		this.name = name;
		this.expirydate = expirydate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(int expirydate) {
		this.expirydate = expirydate;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", expirydate=" + expirydate + "]";
	}
	
	
	
	

}
