package com.sumith.classnotes;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i+" By "+Thread.currentThread().getName());
		Thread thread = Thread.currentThread();
		try
		{
			thread.join();
		} 
		
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		}
	}
}

public class JoinMethod3 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.out.println("Main thread started...");
		 
		 MyThread t1=new MyThread();
		 MyThread t2=new MyThread();
		 
		 t1.setName("Child-1");
		 t2.setName("Child-2");
		 
		 System.out.println("Thread 1");
		 t1.start();

		 System.out.println("Thread 2");
		 t2.start();
		 
		 t2.join();
		 
		 System.out.println("Main thread ended...");
	}

}
