package com.flipkart.orders;

public class Order {
	
	private String orderId;
	private Product product;
	private Transaction transaction;
	
	
	public Order()
	{
		System.out.println("Order instantiated");
	}


	public Order(Product product) {
		super();
		this.product = product;
	}

	

	public Order(Product product, Transaction transaction) {
		super();
		this.product = product;
		this.transaction = transaction;
	}


	public Order(Transaction transaction) {
		super();
		this.transaction = transaction;
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
		System.out.println("Proudct setter invoked");
		this.product = product;
	}


	public Transaction getTransaction() {
		return transaction;
	}


	public void setTransaction(Transaction transaction) {
		System.out.println("Transaction setter invoked");
		this.transaction = transaction;
	}
	
	
	

}
