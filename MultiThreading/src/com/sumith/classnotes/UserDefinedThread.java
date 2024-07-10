package com.sumith.classnotes;

class Defined extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Child Thread is running.");
	}
}

public class UserDefinedThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main method started!!!");
		Defined d=new Defined();
		
		d.start();
		d.start();
		System.out.println(d.isAlive());
		System.out.println("Main method ended.");

	}

}
