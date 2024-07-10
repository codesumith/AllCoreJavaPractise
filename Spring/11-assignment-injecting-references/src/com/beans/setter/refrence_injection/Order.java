package com.beans.setter.refrence_injection;

public class Order {
	
	private int orderId;
	private double orderAmount;
	private Product product;
	
	public Order()
	{
		System.out.println("Order is created..");
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
