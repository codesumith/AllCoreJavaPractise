package com.sumith.labwork_sep25;
class A implements Runnable
{
public void run()
{
System.out.print(Thread.currentThread().getName());
}
}
class B implements Runnable
{
public void run()
{
new A().run();
new Thread(new A(),"T2").run();
new Thread(new A(),"T3").start();
}
}
public class Test15
{
public static void main (String[] args)
{
new Thread(new B(),"T1").start();
}
}



