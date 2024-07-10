package com.sumith.Practise;

class R implements  Runnable 
{
	public void run() {
		
		
		accept(5);
	}



	
	public static synchronized void  accept(int num) {
		
		for(int i=0;i<5;i++) {
			
			System.out.print(num);
		}
		
		System.out.println("runnnable");
		
	}
	
}

public class p {

	public static void main(String[] args) {
		
		R r=new R();
		R r1=new R();
	
		
		Thread t=new Thread(r);
		
		Thread t1=new Thread(r1);
		
		t.start();
		t1.start();
	}

}
