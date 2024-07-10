package com.sumith.synchronisation;


class ThreadName
{
	public void printThreadName()
	{
		//This area is accessible by all the threads
		String name =Thread.currentThread().getName();
		System.out.println("Thread inside the method is : "+name);
		
		synchronized(this) //synchronized block.
		{  
			for(int i=1;i<=9;i++)
			{
				System.out.println(i+" value is :"+i+" by : "+name);
			}
		}
		System.out.println(".........................................");
	}
}

public class ProgramOnBlockLevelSynchronization {

	public static void main(String[] args) {
		
		ThreadName obj1 =new ThreadName();
		
		Runnable r1=()-> obj1.printThreadName();
		
		Thread t1=new Thread(r1,"child1");
		Thread t2=new Thread(r1,"child2");

		t1.start();t2.start();
	}

}
