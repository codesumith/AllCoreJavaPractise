package com.sumith.labWorkMultiThreading;

class MyThread5 extends Thread
{
	Integer x;


	
	public MyThread5(Integer x) {
		super();
		this.x = x;
	}



	public void run()
	{
		for( int i=1;i<=x;i++)
		{
			System.out.println(i+" by "+currentThread().getName());
		}
	}
		
}

public class MultiThreadProgram5 {

	public static void main(String[] args) {
		
		System.out.println("Main started..");
		
		MyThread5 mt1=new MyThread5(5);
		MyThread5 mt2=new MyThread5(10);
		MyThread5 mt3=new MyThread5(15);
		
		
       mt1.setName("1to5"); mt1.start();        
       mt2.setName("1to10");mt2.start();        
       mt3.setName("1to15");mt3.start();
        
        System.out.println("Main ended..");



	}

}
