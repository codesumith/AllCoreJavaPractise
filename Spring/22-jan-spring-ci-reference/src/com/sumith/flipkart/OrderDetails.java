package com.sumith.flipkart;

public class OrderDetails {
	
	private String orderId;
	private double amount;
	private ProductDetails pd;
	
	
	public OrderDetails()
	{
		//default constructor
	}
	
	
	
	public OrderDetails(String orderId, double amount, ProductDetails pd) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.pd = pd;
	}



	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public ProductDetails getPd() {
		return pd;
	}
	public void setPd(ProductDetails pd) {
		this.pd = pd;
	}
	
	
	

}
