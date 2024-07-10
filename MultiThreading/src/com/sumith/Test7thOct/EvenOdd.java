package com.sumith.Test7thOct;

class NumberPrinting implements Runnable{

	private int  start=1;
	private int end=20;
	
	@Override
	public void run() {
		
		for(int i=start;i<=end;i++)
		{
			if(Thread.currentThread().getName()=="Even")
			{   i++;
				System.out.println(i);
				
			}
			else
			{
				System.out.println(i=i+2);
			}
		}
		
		System.out.println("---------------------");
	}
	
}

public class EvenOdd {

	public static void main(String[] args) throws InterruptedException {
		
NumberPrinting nr1=new NumberPrinting();

NumberPrinting nr2=new NumberPrinting();

Thread t=new Thread(nr1); 
t.setName("Even");
t.start();
t.join();



Thread t1=new Thread(nr2); 

t1.start();
	}

}
