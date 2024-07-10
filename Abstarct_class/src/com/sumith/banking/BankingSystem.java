package com.sumith.banking;

public class BankingSystem {

	public static void main(String[] args) {
		
		SavingsAccount sa=new SavingsAccount(1000, 5);
		System.out.println("Savings account Balance is :"+sa.getBalance());
		sa.deposit(5000);
		sa.withdraw(1500);
	    sa.addInterest();
		System.out.println("Savings account Balance is :"+sa.getBalance());
		
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		
		
		CheckingAccount ca=new CheckingAccount(10000, 2000);
		
		ca.withdraw(9000);
		System.out.println("Current Balance is :"+ca.getBalance());

	}

}
