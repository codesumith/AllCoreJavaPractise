package com.sumith.labwork_sep26;

public class Test9 implements Runnable {
	
public void run() 
{
System.out.println("thread running..");
}

public static void main(String[] args)
{
Test9 obj = new Test9();
Thread thread = new Thread(obj);
thread.run();

      }
}