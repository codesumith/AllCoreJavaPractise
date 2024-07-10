package com.sumith.labwork_sep25;
class MyThread extends Thread
{
public void run()
{
System.out.println("MyThread: run()");
}

public void start()
{
    System.out.println("MyThread: start()");
}
}

class MyRunnable implements Runnable
{
public void run()
{
System.out.println("MyRunnable: run()");
}

public void start()
{
    System.out.println("MyRunnable: start()");
}
}

public class Test21
{
public static void main(String args[])
{
MyThread myThread = new MyThread();
MyRunnable myRunnable = new MyRunnable();

Thread thread = new Thread(myRunnable);
myThread.start();
thread.start();
}
}