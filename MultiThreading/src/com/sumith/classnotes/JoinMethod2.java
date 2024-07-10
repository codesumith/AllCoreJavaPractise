package com.sumith.classnotes;


class Join2 extends Thread
{
	@Override
	public void run()
	{
	for(int i=1;i<=5;i++) {
		System.out.println(i +" by "+Thread.currentThread().getName());
		
		try 
		{
			Thread.sleep(1000);
		}
		
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
	}
	
	
}

public class JoinMethod2 {

	public static void main(String[] args) throws InterruptedException{
		
System.out.println("Main thread started!!");
		
Join2 j1=new Join2();
Join2 j2=new Join2();
Join2 j3=new Join2();

j1.setName("Account_Opening");
j2.setName("Deposit");
j3.setName("Withdraw");

j1.start();
j1.join(); //main thread will halt here


j2.start();
j2.join(); //main thread will halt here

j3.start();
j3.join(); //main thread will halt here

System.out.println("Main thread is completed..");
	}

}
