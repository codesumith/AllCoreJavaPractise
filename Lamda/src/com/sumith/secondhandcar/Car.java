package com.sumith.secondhandcar;

public class Car {
	
	private String brand;
	private double price;
	private int mileage;
	
	public Car(String brand, double price, int mileage) {
		super();
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
	}
	protected String getBrand() {
		return brand;
	}
	protected void setBrand(String brand) {
		this.brand = brand;
	}
	protected double getPrice() {
		return price;
	}
	protected void setPrice(double price) {
		this.price = price;
	}
	protected int getMileage() {
		return mileage;
	}
	protected void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", mileage=" + mileage + "]";
	}
	
	

}
