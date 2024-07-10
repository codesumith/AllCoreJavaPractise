package com.sumith.labwork_sep25;
class Test8 //extends Thread
{
public static void main(String[] args)
{
	
try
{
Horse h = new Horse();
Thread t1= new Thread(h,"MyHorse");
//Thread t2= new Thread(h,"YourHorse");

//new Test8().go(t2);

t1.start();
}

catch (Exception e)
{
System.out.println(e);
}

//     void go(Thread t)
//    {
//        t.start();// it is in main method not possible;
//    }       
}
}
class Horse implements Runnable
{
public void run()
{
System.out.println(Thread.currentThread().getName()+" ");
}
}