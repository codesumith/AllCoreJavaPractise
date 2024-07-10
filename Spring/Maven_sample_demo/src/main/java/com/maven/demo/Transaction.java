package com.maven.demo;

import org.springframework.stereotype.Component;

@Component
public class Transaction {
	
	private boolean isOrderSuccesfull;
	
	public Transaction()
	{
		System.out.println("Transaction is intiated..");
		setOrderSuccesfull(true);
	}

	public boolean isOrderSuccesfull() {
		return isOrderSuccesfull;
	}

	public void setOrderSuccesfull(boolean isOrderSuccesfull) {
		this.isOrderSuccesfull = isOrderSuccesfull;
	}

}
