package com.sumith.classnotes;

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		//Anonymous inner class
		Runnable r1=() -> 
		{
			String name=Thread.currentThread().getName();
			System.out.println(name+" thread is running.");
		};
		
		Thread t1= new Thread(r1,"Child-1");
		t1.start();
		String name = Thread.currentThread().getName();
		System.out.println(name+" thread is running.!!!");
	}

}
