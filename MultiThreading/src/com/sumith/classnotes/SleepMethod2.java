package com.sumith.classnotes;

class MyTest extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			}
				
			catch(InterruptedException e) {
				System.out.println("Thread has interrupted.");
			}
			
			System.out.println(i+" by "+Thread.currentThread().getName());
		}
	}
}

public class SleepMethod2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+ " thread");
		
		MyTest t1=new MyTest();
		var t2=new MyTest();
		
		t1.setName("Child1");
		t2.setName("Child2");
		
		t1.start();
		t2.start();
	}

}
