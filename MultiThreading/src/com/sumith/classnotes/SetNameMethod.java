package com.sumith.classnotes;

class Demo extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" thread is running..");
	}
}

public class SetNameMethod {

	public static void main(String[] args) {
		
Thread t= Thread.currentThread();
t.setName("Parent"); // Changing the main thread name.

Demo d1=new Demo();
var d2=new Demo();

d1.setName("Child-1");
d2.setName("Child-2");

d1.start();
d2.start();



System.out.println(Thread.currentThread().getName()+" thread is running..");
	}

}
