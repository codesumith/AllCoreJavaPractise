package com.sumith.flipkart;

public class FlipkartOrder {
	
	private OrderDetails orderDetails;

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		System.out.println("Setter method called...");
		this.orderDetails = orderDetails;
	}
	
	

}
