package com.flipkart.orders;

public class Transaction {
	
	private boolean isSuccess;
	private String message;
	private int transactionId;
	
	public Transaction()
	{
		System.out.println("Transaction instantiated");
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	
	
	
	

}
