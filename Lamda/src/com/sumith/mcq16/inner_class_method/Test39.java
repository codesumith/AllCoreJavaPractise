package com.sumith.mcq16.inner_class_method;

class A17  
{
public  A17()
{
System.out.println("A");
}
public  A17(int i)
{
this();
System.out.println(i);
}
}
class B17 extends A17
{
public B17 ()
{
System.out.println("B");
}
public B17 (int i)
{
this();
System.out.println(i+3);
}
}
public class Test39
{
public static void main (String[] args)
{
new B17(5);
}
}