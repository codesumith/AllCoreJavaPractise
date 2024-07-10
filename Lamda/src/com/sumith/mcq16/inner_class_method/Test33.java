package com.sumith.mcq16.inner_class_method;

class A1 
{
public void printName()
{
System.out.println("Value-A");
}
}
class B15 extends A1
{
public  void printName()
{
System.out.println("Name-B");
}
}
public class Test33
{
public static void main (String[] args)
{
A1 b = new B15();

newPrint(b);

}
public static void newPrint(A1 a)
{
	
a.printName();

}
}
