package com.flipkart.orders;

public class Order {
	
	private String orderId;
	private Product product;
	private Transaction transaction;
	
	
	public Order()
	{
		System.out.println("Order instantiated");
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		System.out.println("Product is injected via setter.");
		this.product = product;
	}
	
	public Transaction getTransaction() {
		
		return transaction;
	}
	
	public void setTransaction(Transaction transaction) {
		System.out.println("Transaction is injected via setter.");

		this.transaction = transaction;
	}
	
	
	

}
