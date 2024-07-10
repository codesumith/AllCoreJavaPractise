package com.sumith.mcq16.inner_class_method;

class C4 
{
}
class D1 extends C4
{
}
class A13
{
	
public C4 getOBJ()
{
	
System.out.println("class A - return C");

return new C4();
}
}
class B13 extends A13
{
public D1 getOBJ()
{

	System.out.println("class B - return D");

    return new D1();
}
}
public class Test31
{
public static void main(String... args) 
{
     A13 a = new B13();
     
     a.getOBJ();
}
}