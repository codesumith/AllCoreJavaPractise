package com.sumith.ShoppingCart;

public class ElectronicProduct extends Product {
	
	private double warranty;
	
	public ElectronicProduct(String name, double price,double warranty) {
		super(name, price);
		this.warranty=warranty;
		
	}

	@Override
	public String getDetails() {
		
	 return "ElectronicProduct [ name=" + name + ", price=" + price + ", warranty=" + warranty + " Years]";
	}

	

	@Override
	public double calculateTotalPrice() {
		
		return price=price+(price*10)/100;
	}

	

	
	
	

}
