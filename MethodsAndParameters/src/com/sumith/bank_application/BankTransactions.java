package com.sumith.bank_application;

public class BankTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bn=new Bank();

		//bn.withdraw(1000);
			bn.setDetails("icici","hdfc" , "HYd", "HYD00123", 123456789,1000);
				//bn.deposit(2000);
			//bn.withdraw(9500);
//				String displayDetails = bn.displayDetails();
//				System.out.println(displayDetails);
			System.out.println(bn.displayDetails());	
				bn.withdraw(9500);
				bn.deposit(2000);
				bn.CurrentBalance();
				System.out.println(bn.displayDetails());
				bn.withdraw(9500);

		
		

	}

}
