package com.sumith.mcq16.inner_class_method;

class A3
{
static public void main (String[] args) 
{
//A3 a1 = new B3();
//a1.foo();
}
static void foo()
{
	System.out.println("A");
}
}
class B3 extends A3 
{
//void foo() //compilation error
{
	System.out.println("B"); 
}
}