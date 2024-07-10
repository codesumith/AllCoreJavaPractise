package com.sumith.mcq16.inner_class_method;

class A8 
{
public void printValue()
{
System.out.println("Value-A");
}
}
class B8 extends A8
{
public void printNameB()
{
System.out.println("Name-B");
}
}
class C2 extends A8
{
public void printNameC()
{
System.out.println("Name-C");
}
}
public class Test27
{
public static void main (String[] args) 
{
B8 b = new B8();
C2 c = new C2();
newPrint(b);
newPrint(c);
}
public static void newPrint(A8 a)
{
a.printValue();
}
}