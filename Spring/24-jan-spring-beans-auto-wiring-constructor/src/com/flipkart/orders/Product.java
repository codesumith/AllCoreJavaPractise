package com.flipkart.orders;

public class Product {
	
	private int id ;
	private double amount;
	private String name;
	
	public Product()
	{
		System.out.println("Product instantiated");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
