package com.sumith.ShoppingCart;

public class ClothingProduct  extends Product{
	
	private String size;

	
	public ClothingProduct(String name, double price,String size) {
		super(name, price);
		this.size=size;
	}

	
	@Override
	public String getDetails() {
		
		return "ClothingProduct [ name=" + name + ", size=" + size + ", price=" + price + "]";
	}

	


	@Override
	public double calculateTotalPrice() {
		
		return price=price+(price*5)/100;
	}
	
	

}
