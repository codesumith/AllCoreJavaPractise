package com.sumith.sep23test;

@SuppressWarnings("serial")
class InsufficentException extends Exception
{

	public InsufficentException(String msg) {
		super(msg);
	}
	
	
}


class BankingOperation
{
	double balance;
	
	
	public BankingOperation(double balance) {
		super();
		this.balance = balance;

	}
	
	public void deposit(double amount)
	{
		balance+=amount;
		System.out.println("Deposited Succefull");
	}
	
	public void withdraw(double amount) throws InsufficentException
	{
		if(amount>balance)
		{
			throw new InsufficentException("Insufficent Exception");
		}
		
		else
		{
			balance-=amount;
			System.out.println("Wihdraw Succefull");
		}
	}
	
}

public class User {

	public static void main(String[] args) {
		
		BankingOperation bo = new BankingOperation(5000);
try {
	bo.withdraw(7000);
} catch (InsufficentException e) {
	// TODO Auto-generated catch block
	System.out.println("Insufficient Balance");
}
	}

}
