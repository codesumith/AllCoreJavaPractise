package com.sumith.problem_with_multithreading;

class MyThread implements Runnable
{
	
	private String str;
	
	

	public MyThread(String str) {
		super();
		this.str = str;
	}



	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(str+" : "+i);
			
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Theater {
	
	public static void main(String[] args) {
		
		var mt1=new MyThread("Cut the Ticket.");
		MyThread mt2=new MyThread("Allocate the ticket.");
		
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		
		t1.start();
		t2.start();
	}

}
