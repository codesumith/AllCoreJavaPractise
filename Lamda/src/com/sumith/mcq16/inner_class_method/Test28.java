package com.sumith.mcq16.inner_class_method;

class A10 
{
public void printName()
{
System.out.println("Value-A");
}
}

class B10 extends A10
{
public void printName()
{
System.out.println("Name-B");
}
}

public class Test28
{
public static void main (String[] args)
{
A10 b = new B10();
newPrint(b);
}
public static void newPrint(A10 a)
{
a.printName();
}
}