package com.sumith.flipkart;

public class ProductDetails {
	
	private int productId;
	private String name;
	private Double price;
	
	
	
	public ProductDetails() {
		super();
		System.out.println("ProductDetails object created...");
	}
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}


	
	

}
