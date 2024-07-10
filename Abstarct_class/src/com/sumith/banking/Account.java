package com.sumith.banking;

abstract class Account {
	
	protected double balance;
	
	public Account(double initialBalance) {
		balance=initialBalance;
	}
	
	public abstract void deposit(double amount) ;
		
	public abstract void withdraw(double amount);
	
	public double getBalance() {
		
		return balance;
	}
	

}
