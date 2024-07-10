package com.sumith.banking;

public class SavingsAccount extends Account{
	
	
	private double intrestRate;
	
	public SavingsAccount(double initialBalance,double intrestRate) {
		super(initialBalance);
		
		this.intrestRate=intrestRate;
		
	}

	@Override
	public void deposit(double amount) {
		balance+=amount;
	    // balance=balance+amount;
		System.out.println("Balance after depositing of :"+amount+" = "+balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if(balance-amount>0) {
			balance-=amount;
			System.out.println("Balance after withdrawl of :"+amount+" = "+balance);
		}
		
		else {
			System.out.println("Insufficent Balance");
		}
		//balance=balance-amount;
		//System.out.println(balance);
	}

	public void addInterest() {
		
		
		balance=balance+balance*(intrestRate/100);
		
	}

}
