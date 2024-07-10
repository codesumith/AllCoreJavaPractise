package com.sumith.synchronisation;


class Table
{
	public synchronized void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
	   System.out.println("................................");
	}
}

public class MethodLevelSynchronization {

	public static void main(String[] args) {
		
Table t=new Table();  //obj has lock.

Thread t1=new Thread()
{
public void run()
{
	t.printTable(5);
}
};


Thread t2=new Thread()
{
public void run()
{
	t.printTable(10);
}
};

t1.start(); t2.start();
	}

}
