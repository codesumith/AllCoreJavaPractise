package com.sumith.class_25_sep_interthreadcomunication;

class SecondThread extends Thread
{
	int x=0;
	@Override
	public void run()
	{
		//ChildThread is waiting for lock
		synchronized(this)
		{
			for(int i=1;i<=100;i++)
			{
				x=x+i;
			}
			System.out.println("Sending notification");
			notify();  //will give notification to waiting thread
		}
	}
}

public class InterThreadComunication {

	public static void main(String[] args) {
		
SecondThread b= new SecondThread();
b.start();

synchronized(b) //lock is taken by main method
{
	//suspend
	try
	{
		System.out.println("Waiting for b to complete...");
		
		b.wait(); // after releasing the lock, waiting here
		
		System.out.println("Main thread is wake up");
		
	}
	catch(Exception e)
	{
		
	}
	
	System.out.println("Value is:"+b.x);
	
}
	}

}
