package com.sumith.threadclassmethods;


public class ThreadYieldMethod {

	public static void main(String[] args) {
		
Runnable r1=()->
{
	for(int i=0;i<=10;i++)
	{
		String name =Thread.currentThread().getName();
		
		System.out.println("i value is "+i+" by "+name);
		
		if(name.equals("Child1")){
			Thread.yield(); //give a chance to child2 thread
		}
	}
};

Thread t=new Thread(r1,"Child1");
Thread t1=new Thread(r1,"Child2");


t.start();
t1.start();

	}

}
