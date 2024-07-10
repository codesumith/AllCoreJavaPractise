package com.sumith.banking;

public class CheckingAccount extends Account{
	
	
	public double overDraftLimit;

	public CheckingAccount(double initialBalance,double overDraftLimit) {
		super(initialBalance);
		this.overDraftLimit=overDraftLimit;
		
		
	}

	@Override
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println(balance);
		
	}

	@Override
	public void withdraw(double amount) {
		//double totalAmount=balance-amount;
		
		//double limit=totalAmount-overDraftLimit;
		
		balance=balance-overDraftLimit;
		
		if(balance>=amount) 
		{
			
			balance-=amount;
			
		}
		
		else {
			
			System.out.println("Exceeding overdraftLimit");
			
		}
		//balance=balance-amount;
		//System.out.println(balance);
	}

}
