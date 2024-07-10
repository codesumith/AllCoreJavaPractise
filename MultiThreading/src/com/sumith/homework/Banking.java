package com.sumith.homework;

public class Banking {
	
	double Balance=100000;
	double withdraw;

	
	public Banking(double withdraw) {
		super();
		this.withdraw = withdraw;
	}

	
	public static void main(String[] args) {
		Banking b=new Banking(90000);
		
		Runnable r=()->
		{
			
			String name = Thread.currentThread().getName();
			   System.out.println(name+" Available Balance is :"+b.Balance);
			   
			if(b.Balance>=b.withdraw)
			{
				b.Balance-=b.withdraw;
				System.out.println("withdrawl Successful");
			}
			else System.out.println("Insufficent Balance.");
		};
		
		 Thread t1 = new Thread(r,"Sumith");
		   Thread t2 = new Thread(r,"sumith");

		   t1.start(); t2.start();
	}

}
