package com.sumith.labwork_sep25;
class Test14
{
public static void main(String[] args)
{
Runnable r1 = new Runnable()
{
public void run()
{
try
{
while (true)
{
System.out.println("Hello, world!");
Thread.sleep(1000);
}
}
catch (InterruptedException iex) {System.out.println("r1");}
}
};
Runnable r2 = new Runnable()
{
public void run()
{
try
{
while (true)
{
System.out.println("Goodbye, " +" Beautiful world!");
Thread.sleep(2000);
}
} catch (InterruptedException iex) {System.out.println("r2");}
}
};

Thread thr1 = new Thread(r1);
Thread thr2 = new Thread(r2);
thr1.start();
thr2.start();
}
}