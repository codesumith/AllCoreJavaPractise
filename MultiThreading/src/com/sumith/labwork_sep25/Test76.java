package com.sumith.labwork_sep25;
public class Test76
{
public static void main(String[] args)
{
new Test76().go();
}
public void go()
{
Runnable r = new Runnable()
{
public void run()
{
System.out.println("foo");
}};
Thread t = new Thread(r);
t.start();
t.run();
}
}