package com.beans.setter.refrence_injection;

public class Product {
	
	private String name;
	private int yearOfExpiry;
	private float price;
	
	public Product()
	{
		System.out.println("Product Created...");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfExpiry() {
		return yearOfExpiry;
	}
	public void setYearOfExpiry(int yearOfExpiry) {
		this.yearOfExpiry = yearOfExpiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
