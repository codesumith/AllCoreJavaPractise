package com.sumith.bank;

public class Customer implements Bank {
	
	private double balance=12000;

	@Override
	public void deposit(int depositAmount) {
		if(depositAmount<=0) {
			System.out.println("Amount cannot deposit");
		}
		else
			balance=balance+depositAmount;
		System.out.println("Balance After deposit"+balance);
	}

	@Override
	public void withdraw(int withdrawAmount) {
		
       if(withdrawAmount > balance) {
    	   System.out.println("You can't withdraw : "+withdrawAmount+"Amount");
    	   
       }
       
       else {
    	   
    	   balance=balance-withdrawAmount;
    	   System.out.println("Balance After withdraw is : "+balance);
       }
	}

}
