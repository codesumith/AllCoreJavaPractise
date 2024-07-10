package com.sumith.static_synchronization;

class MyTable
{
	public static synchronized void printTable(int num) 
	{
		for(int i=1;i<=10;i++)
		{
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}	

System.out.println(num+" X "+i+" = "+(num*i));

		}
		System.out.println("------------------------------");
	}
}

public class StaticSynchronization {

	public static void main(String[] args) {
		
		Thread t=new Thread()
				{
			@Override
		public void run()
		{
			MyTable.printTable(5);
		}
				};
				
				
				new Thread()
						{
					@Override
					public void run()
					{
						MyTable.printTable(10);
					}
						}.start();
						
						Runnable r3=new Runnable()
								{

									@Override
									public void run() {
										MyTable.printTable(15);
										
									}
							
								};
								
								Thread t1=new Thread(r3);
								
								t.start();
									t1.run();
								

	}

}
