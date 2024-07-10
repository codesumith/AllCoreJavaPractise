package com.sumith.classnotes;

class Sample extends Thread{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("i value is :"+i+" by "+name+" thread.");
		}
		
	}
}

public class ThreadLoop {

	public static void main(String[] args) {
		
		System.out.println("Main thread started.");
		
		Sample s=new Sample();
		s.start();
		
		var name=Thread.currentThread().getName();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("i value is : "+i+" by "+name+" thread.");
		}
		
		int x=1;
		do
		{
			System.out.println("Hello");
			x++;
		}
		while(x<=10);

	}

}
