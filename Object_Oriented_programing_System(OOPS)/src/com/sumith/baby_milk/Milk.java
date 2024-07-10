package com.sumith.baby_milk;

public class Milk {

	private String milkBrand;
	private double milkPrice;
	
	
	public String getMilkBrand() {
		return milkBrand;
	}
	
	
	public double getMilkPrice() {
		return milkPrice;
	}
	
	
	
	public Milk(String milkBrand, double milkPrice) {
		super();
		this.milkBrand = milkBrand;
		this.milkPrice = milkPrice;
	}
	
	
	
	@Override
	public String toString() {
		return "Milk [milkBrand=" + milkBrand + ", milkPrice=" + milkPrice + "]";
	}
	
	
	
	
}
