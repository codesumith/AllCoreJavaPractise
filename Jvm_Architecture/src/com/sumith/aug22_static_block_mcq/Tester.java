package com.sumith.aug22_static_block_mcq;

interface Bank
{
    void deposit(double amount);
    
    void withdraw(double amount);
    
    double checkBalance();
}


class Sbi implements Bank{
	
	private double accountBalance;
	
	

	public Sbi(double accounBalance) {
		super();
		this.accountBalance = accounBalance;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
		accountBalance=accountBalance+amount;
		 System.out.println("Balance After Deposit : "+accountBalance);
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
		 this.accountBalance=this.accountBalance-amount;
		 System.out.println("Balance After Withdraw : "+accountBalance);
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		System.out.print("Sbi AccountBlance is :");
		return this.accountBalance;
	}
	
}

class Hdfc implements Bank{

	private double accountBalance;
	
	
	public Hdfc(double accounBalance) {
		super();
		this.accountBalance = accounBalance;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
		accountBalance=accountBalance+amount;
		 System.out.println("Balance After Deposit : "+accountBalance);
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
		 this.accountBalance=this.accountBalance-amount;
		 System.out.println("Balance After Withdraw : "+accountBalance);
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		System.out.print("Hdfc AccountBlance is :");
		return this.accountBalance;
	}
	
}

class Icici implements Bank{
	
	private double accountBalance;
	
	

	public Icici(double accounBalance) {
		super();
		this.accountBalance = accounBalance;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
		accountBalance=accountBalance+amount;
		 System.out.println("Balance After Deposit : "+accountBalance);
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
		 this.accountBalance=this.accountBalance-amount;
		 System.out.println("Balance After Withdraw : "+accountBalance);
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		System.out.print("Icici AccountBlance is :");
		return this.accountBalance;
	}
	
}


class Customer{
	
	String name;
	double accountBlance;
	
	
	
	public Customer(String name, double accountBlance) {
		super();
		this.name = name;
		this.accountBlance = accountBlance;
	}

	public double deposit(Bank bank,double amount) {
		return amount;
		
	}
	
	public double  withdraw(Bank bank,double amount) {
		return amount;
		
	}
	
	public double checkBalance(Bank bank) {
		return accountBlance;
		
	}
}
public class Tester
{
    public static void main(String[] args)
    {
       
    	Sbi s=new Sbi(1000);
    	s.deposit(3000);
    	s.withdraw(1000);
    	s.checkBalance();
    	
    	Hdfc h=new Hdfc(1000);
    	h.deposit(3000);
    	h.withdraw(1000);
    	h.checkBalance();
    	
    	Icici i=new Icici(1000);
    	i.deposit(3000);
    	i.withdraw(1000);
    	i.checkBalance();
    	
    	Customer c=  new Customer("Anil",10000);
    	c.checkBalance(i);
    }
}