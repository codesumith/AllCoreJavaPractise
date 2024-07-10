package com.sumith.classnotes;

class UserDefineThread extends Thread
{
	@Override
	public void run() {
		System.out.println("Child thread is running");
		System.out.println("It is running with separate stack");
	}
}

public class IsAliveMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main method started.");
		UserDefineThread uf=new UserDefineThread();
		
		System.out.println("Thread has not started yet so : "+uf.isAlive());
		uf.start();//New thread has created.
		
		//Thread.sleep(1000);
		System.out.println("Thread has started so : "+uf.isAlive());
		
		uf.start();// java.lang.IllegalThreadStateException.

	}

}
