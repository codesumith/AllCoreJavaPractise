package com.sumith.classnotes;

class Stuff extends Thread
{
	@Override
	public void run()
	{
	System.out.println("Child Thread is running");	
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Main thread started.");
		
		Stuff st=new Stuff();
		st.start();
		
		Stuff st1=new Stuff();
		st1.start();


		System.out.println(10/0);
		
		System.out.println("Main thread ended.");
	}

}


//Here main interrupted due to ae exception but still child thread will executed.