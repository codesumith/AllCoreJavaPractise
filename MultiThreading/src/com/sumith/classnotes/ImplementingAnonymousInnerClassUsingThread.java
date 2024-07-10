package com.sumith.classnotes;

public class ImplementingAnonymousInnerClassUsingThread {

	public static void main(String[] args) {
		
		//Anonymous inner class using thread
		
		Thread t1=new Thread()
				{
			@Override
			public void run()
			{
				String name=Thread.currentThread().getName();
				System.out.println(name+" thread is  running @@@.");
			}
				};
				
				
				String name=Thread.currentThread().getName();
				System.out.println(name+" thread is  running !!!.");
				
				t1.start();
				
				//Anonymous inner class without reference
				
				new Thread()
				{
					@Override
					public void run()
					{
						String name=Thread.currentThread().getName();
						System.out.println(name+" thread is  running $$$.");
					}
				}.start();

	}

}
