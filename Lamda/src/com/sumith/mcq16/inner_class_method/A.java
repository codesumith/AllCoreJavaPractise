package com.sumith.mcq16.inner_class_method;

class A2 
{
static void foo()
{
System.out.println("A");
}
}

class B2 extends A2
{
//static int foo()
{
System.out.println("B");
//return 1;
}
}//error we cannot change return type incompatable;