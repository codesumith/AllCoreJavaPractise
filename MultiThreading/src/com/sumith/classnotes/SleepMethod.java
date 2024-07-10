package com.sumith.classnotes;

class Sleep extends Thread
{
	@Override
	public void run()
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println("i value is : "+i);
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			
			System.out.println(e);
		}
	}
	}
}

public class SleepMethod {

	public static void main(String[] args) {
		
System.out.println("Main thread started.");

Sleep s=new Sleep();
s.start();

System.out.println("Main thread ended.");

	}

}
