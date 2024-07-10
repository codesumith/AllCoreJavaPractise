package com.sumith.bank_application;

public class Bank {
	
	private String bankName;
	private String bankCutomerName;
	private String bankAddress;
	private String bankIFCCode;
	private int customerAccountNumber;
	private int currentBalance;
	//1  
	public void setDetails(String bankName,String bankCutomerName,String bankAddress,String bankIFCCode,int customerAccountNumber,int currentBalance) {
		
		this.bankName=bankName;
		this.bankCutomerName=bankCutomerName;
		this.bankAddress=bankAddress;
		this.bankIFCCode=bankIFCCode;
		this.customerAccountNumber=customerAccountNumber;
		this.currentBalance=currentBalance;
		
	}
	//2
	public void withdraw(double amount) {
		
		if(currentBalance<=1000) System.out.println("InsufficientBalance");
		
		else if((currentBalance-amount)>=1000){	
			currentBalance=(int) (currentBalance-amount);
		
		 if(currentBalance<1000) System.out.println("Maintain minimum Balance");
		 else if(currentBalance>=1000) System.out.println("Transaction successful. Available Balance: Rs."+currentBalance);	
		}
		else {
			System.err.println("Insufficent funds 1000 minimum Balance is required");
		}
	}
//3
	public void deposit(double amount) {
		//int minimumbalance=1000;
		//currentBalance=currentBalance+minimumbalance;
		currentBalance=(int) (currentBalance+amount);
		System.out.println("Deposited succesful. Available Balance: Rs."+currentBalance);
		
}
	public void CurrentBalance() {
		
		System.out.println("CurrentBalance:"+currentBalance);
	}
	//5
	public String displayDetails() {
		//toString();
		return toString();
		
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCutomerName=" + bankCutomerName + ", bankAddress=" + bankAddress
				+ ", bankIFCCode=" + bankIFCCode + ", customerAccountNumber=" + customerAccountNumber
				+ ", currentBalance=" + currentBalance + "]";
	}
	
	
	
	
	
	
	
	
}