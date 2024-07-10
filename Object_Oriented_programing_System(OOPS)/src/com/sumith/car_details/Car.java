package com.sumith.car_details;

public class Car {

	
	private String brand;
	private String model;
	private int year;
	private Driver driver;//has  a relation
	
	public Car(String brand, String model, int year, Driver driver) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}
	
	public Car(Car object) {
		super();
		this.brand = object.brand;
		this.model = object.model;
		this.year = object.year;
		this.driver = object.driver;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public void changeDriver(Driver newDriver) {
		
		
		this.driver=newDriver;
		
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver+ "]";
	}
	
}
