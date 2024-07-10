package com.sumith.threadclassmethods;

class MyRunnable implements Runnable
{

	@Override
	public void run() {
		try 
		{
			while(!Thread.currentThread().isInterrupted())
			{
				System.out.println("Thread is running.");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread is gracefully.");
		}
		
		finally
		{
			System.out.println("Thread resourse can be release here");
		}
	}
	
}

public class InterruptedThread2 {
	
	public static void main(String[] args) {
		
		Thread thread =new Thread(new MyRunnable());
		thread.start();
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		thread.interrupt();
		
	}

}
