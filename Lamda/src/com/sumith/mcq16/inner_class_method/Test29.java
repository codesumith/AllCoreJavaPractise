package com.sumith.mcq16.inner_class_method;

class A11 
{
public void printName()
{
System.out.println("Value-A");
}
}
class B11 extends A11
{
public void printName()
{
System.out.println("Name-B");
}
}
class C11 extends A11
{
public void printName()
{
System.out.println("Name-C");
}
}
public class Test29
{
public static void main (String[] args) {

	A11 b = new B11();

	C11 c = new C11();

    b = c;

    newPrint(b);

    
}
public static void newPrint(A11 a){
	
a.printName();

}
}
