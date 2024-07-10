package com.spring.annotations.demo;



public class Product {
	
	private int id;
	private String name;
	private double price;
	
	public Product() {
		System.out.println("Product is intantiated.....");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
