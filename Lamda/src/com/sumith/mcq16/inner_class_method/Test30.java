package com.sumith.mcq16.inner_class_method;

class A12
{
public void printName()
{
System.out.println("Value-A");
}
}
class B12 extends A12
{
public void printName()
{
System.out.println("Name-B");
}
}
class C3 extends A12
{
public void printName()
{
System.out.println("Name-C");
}
}
public class Test30
{
public static void main (String[] args) 
{

	B12 b = new B12();
   // C3  c = new C3();
        //b = c;
        newPrint(b);
}
public static void newPrint(A12 a)
{
a.printName();
 }
 }
