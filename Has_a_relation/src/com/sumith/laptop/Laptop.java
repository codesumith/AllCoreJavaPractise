package com.sumith.laptop;

public class Laptop {
	
	
	private String laptopCompany;
	private String model;
	private double price;
	private MotherBoard mk;
	
	public Laptop(String laptopCompany, String model, double price, MotherBoard mk) {
		super();
		this.laptopCompany = laptopCompany;
		this.model = model;
		this.price = price;
		this.mk = mk;
	}
	

	public Laptop(Laptop lp) {
		super();
		this.laptopCompany = lp.laptopCompany;
		this.model = lp.model;
		this.price = lp.price;
		this.mk = lp.mk;
	}


	


	public String getLaptopCompany() {
		return laptopCompany;
	}

	public void setLaptopCompany(String laptopCompany) {
		this.laptopCompany = laptopCompany;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MotherBoard getMk() {
		return mk;
	}

	public void setMk(MotherBoard mk) {
		this.mk = mk;
	}


	@Override
	public String toString() {
		return "Laptop [laptopCompany=" + laptopCompany + ", model=" + model + ", price=" + price + ", mk=" + mk + "]";
	}

	
	
	

}
