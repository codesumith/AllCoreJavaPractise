package com.sumith.labWorkMultiThreading;

class MyThread2 extends Thread
{
	@Override
	public void run()
	{
		for(int i=86;i<=90;i++)
		{
			System.out.println((char)i);
		}
	}
}

class MyThread3 extends Thread
{
	@Override
	public void run()
	{
		for(int i=76;i<=85;i++)
		{
			System.out.println((char)i);
		}
	}
}
public class MultiProgram3 {

	public static void main(String[] args) {
		MyThread2 mt2=new MyThread2();
		MyThread3 mt3=new MyThread3();
		
		mt2.start();
		mt3.start();
		
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
		}
	}
}
