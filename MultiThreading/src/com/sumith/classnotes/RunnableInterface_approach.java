package com.sumith.classnotes;

class MyThread1 implements Runnable
{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" thread is running.");
		
	}
	
}

public class RunnableInterface_approach {

	public static void main(String[] args) {
		System.out.println(" Main thread started ");
		MyThread1 mt1=new MyThread1();
		
		Thread t1=new Thread(mt1,"Child1");
		t1.start();
		
		Thread t2=new Thread(mt1,"Child2");
		t2.start();
	}

}
