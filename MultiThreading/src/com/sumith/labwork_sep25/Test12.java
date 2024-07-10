package com.sumith.labwork_sep25;
public class Test12 extends Thread
{
public static void main(String argv[])
{
Test12 b = new Test12();
b.run();
b.start();
}
public void start()
{
for (int i = 0; i < 10; i++)
{
System.out.println("Value of i = " + i);
}
}
}