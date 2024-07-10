package com.sumith.threadclassmethods;

class Interrupt1 extends Thread
{
	public void run()
	{
		try
		{
			Thread.currentThread().interrupt();
			
			for(int i=1;i<=10;i++)
			{
				System.out.println("i value is :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.err.println("Thread is interrupted :"+e);
		}
	}
}

public class InterruptedThread1 {

	public static void main(String[] args) {
		
System.out.println("Main thread is started.");
Interrupt1 it=new Interrupt1();
it.start();
System.out.println("Main thread is ended.");
	}

}
