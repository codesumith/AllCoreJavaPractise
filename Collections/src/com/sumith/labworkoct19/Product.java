package com.sumith.labworkoct19;

public class Product {
	
	private String productName;
	private String productExpiryDate;
	public Product(String productName, String productExpiryDate) {
		super();
		this.productName = productName;
		this.productExpiryDate = productExpiryDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(String productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productExpiryDate=" + productExpiryDate + "]";
	}
	
	

}
