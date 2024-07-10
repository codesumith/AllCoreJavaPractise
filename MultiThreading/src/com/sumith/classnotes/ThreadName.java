package com.sumith.classnotes;

class Test extends Thread
{
	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		System.out.println(name+" thread is running here!!!");
	}
}

public class ThreadName {

	public static void main(String[] args) {
		
Test t1=new Test();
t1.start();

var t2=new Test();
t2.start();

System.out.println(Thread.currentThread().getName().toUpperCase()+" thread is running.");

	}

}

// so here as user we are  not setting the thread name, so by default JVM will assign the default name thread-0, thread-1 so on.
