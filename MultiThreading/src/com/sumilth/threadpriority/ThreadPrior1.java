package com.sumilth.threadpriority;

public class ThreadPrior1 extends Thread{
	@Override
	public void run()
	{
//		int count=0;
		
		for(int i=0;i<100000;i++)
		{
//			count++;
		}
		
		System.out.println("Thread name is :"+Thread.currentThread().getName());
		System.out.println("Thread priority is :"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		 ThreadPrior1 t=new ThreadPrior1();
		ThreadPrior1 t1=new ThreadPrior1();
		
		t.setPriority(MIN_PRIORITY);
		t1.setPriority(MAX_PRIORITY);
		
		t.setName("last");
		t1.setName("first");
		
		t.start();
		t1.start();
	}

}
