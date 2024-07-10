package com.sumilth.threadpriority;

class Threadp extends Thread
{
	@Override
	public void run()
	{
		int priority =Thread.currentThread().getPriority();
		
		System.out.println("Child thread priority is :"+priority);
	}
}

public class MainPriority1 {

	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY);
		
//t.setPriority(11);

System.out.println("Main thread priority is : "+t.getPriority());

Threadp tp=new Threadp();
tp.start();


	}

}
