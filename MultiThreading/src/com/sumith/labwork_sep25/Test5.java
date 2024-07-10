package com.sumith.labwork_sep25;
class SimpleThread extends Thread
{
	
public SimpleThread(String str)
{
super(str);
}

public void run()
{
	
for (int i = 0; i < 10; i++)
{
	
System.out.println(i + " " + getName());

try
{
sleep((int)(Math.random() * 1000));
}

catch (InterruptedException e) {}

}

System.out.println("DONE! " + getName());
}
}
public class Test5
{
public static void main (String args[])
{
	new SimpleThread("J2EE").start();
	new SimpleThread("J2ME").start();
}
}