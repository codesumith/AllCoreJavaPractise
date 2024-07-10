package com.sumith.synchronisation;


class ThreadName1
{
	public void printName()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+"Thread is running...");
		
		
		synchronized(this)
		{
			for(int i=0;i<=9;i++)
			{
				System.out.println("i value is "+i+" by "+name);
			}
		}
	}
}

public class BlockSync {

	public static void main(String[] args) {
		
ThreadName1  t =new ThreadName1();

Runnable r1= ()->
{t.printName();};

Thread t1=new Thread(r1,"Child-1");
Thread t2=new Thread(r1,"Child-2");

t1.start();t2.start();

	}

}
