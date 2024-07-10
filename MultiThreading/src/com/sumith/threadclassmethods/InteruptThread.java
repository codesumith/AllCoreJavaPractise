package com.sumith.threadclassmethods;

class Interrupt extends Thread
{
	@Override
	public void run()
	{
		Thread t= currentThread();
		System.out.println(t.isInterrupted());
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Thread is interrupted");
				e.printStackTrace();
				
			}
		}
		
	}
}
public class InteruptThread {

	public static void main(String[] args) {
	
Interrupt it=new Interrupt();
System.out.println(it.getState());
it.start();
it.interrupt();

	}

}
