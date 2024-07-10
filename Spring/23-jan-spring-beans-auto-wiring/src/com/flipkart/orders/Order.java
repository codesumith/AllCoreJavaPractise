package com.flipkart.orders;

public class Order {
	
	private String orderId;
	private Product product;
	private Transaction transaction;
	
	
	
	public Order() {
		super();
		
	}

	public Order(Product product) {
		super();
		System.out.println("Product Constructor invoked");
		this.product = product;
	}
	
	public Order(Transaction transaction) {
		super();
		System.out.println("Transaction Constructor invoked");

		this.transaction = transaction;
	}

	public Order(Product product, Transaction transaction) {
		super();
		System.out.println("Product and Transactions Constructor invoked");

		this.product = product;
		this.transaction = transaction;
	}
	
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		System.out.println("Id Setter invoked");
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		System.out.println("Product Setter invoked");

		this.product = product;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		System.out.println("Transaction Setter invoked");

		this.transaction = transaction;
	}
	
	

}
