package com.sumith.sep9TestPrograming;

@SuppressWarnings("serial")
class InsufficentFundsException extends Exception{
	
	public InsufficentFundsException(String message)
	{
		super(message);
	}
	
}

class BankAccount{
	
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficentFundsException
	{
		if(amount>balance)
		{
			throw new InsufficentFundsException("Insufficient funds in your account");
		}
		else
		{
			balance-=amount;
			System.out.println("Withdrawl succesful");
			System.out.println("Updated balance is : "+balance);
		}
		
	}
}

public class BankAccountWithdrawalValidation {

	public static void main(String[] args)  {
		try {
			BankAccount b=new BankAccount(1000);
			
			b.withdraw(1500);
		}
		catch(InsufficentFundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------------------------------------------------");
		try {
			BankAccount b=new BankAccount(1000);
			
			b.withdraw(500);
		}
		catch(InsufficentFundsException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
