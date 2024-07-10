package com.sumith.ShoppingCart;

abstract class Product {
	
	protected String name;
	 protected double price;
	
	 
	 
	 public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	 
	 public abstract String getDetails();
		 
		 
	 public abstract double calculateTotalPrice();
		 
		 
		  
	 
}
