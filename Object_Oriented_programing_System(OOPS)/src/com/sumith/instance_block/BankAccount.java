package com.sumith.instance_block;

public class BankAccount {
	
	private double balance;
	private double intrestRate;
	
	{
		intrestRate=0.01;
	}

	
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

public double deposit(double amount) {
	
	return balance=balance+amount;
}
public double withdraw(double amount) {
	
	return balance=balance-amount;
}
public double calculateIntrest() {
	return balance*intrestRate;
}
	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount(1000);
		System.out.println("Initial Balance:Rs"+ba.balance);
		System.out.println("After deposit:Rs"+ba.deposit(500));
		System.out.println("After withdraw:Rs"+ba.withdraw(200));
		System.out.println("Intrest earned:Rs"+ba.calculateIntrest());
	}

}
