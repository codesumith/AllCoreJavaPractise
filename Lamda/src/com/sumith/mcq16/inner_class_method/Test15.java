package com.sumith.mcq16.inner_class_method;

class A4 
{
void foo() 
{
System.out.println("A");
}
}

class B1 extends A4 
{
void foo() 
{
System.out.println("B");
}
}	

class Test15
{
public static void main(String[] args)
{
A4 obja;
B1 objb = new B1();
objb.foo();
obja = objb;
obja.foo();
}
}
