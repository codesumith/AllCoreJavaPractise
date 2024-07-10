package com.sumith.mcq16.inner_class_method;

class A18 
{
public void printName()
{
System.out.println("Name-A");
}
}

class B18 extends A18
{
public void printName()
{
System.out.println("Name-B");
}
public void printValue() 
{
System.out.println("Value-B");
}
}
public class Test42
{
public static void main (String[] args)
{
A18 a = new A18();

B18 b = (B18)a;

b.printName();
}
}