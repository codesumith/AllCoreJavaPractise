package com.sumith.labWorkMultiThreading;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}

public class MultiProgram2 {

	public static void main(String[] args) {
		
		MyThread mt=new MyThread();
		
		mt.start();
		

		for(int i=11;i<=20;i++)
		{
			System.out.println(i);
		}

	}

}
