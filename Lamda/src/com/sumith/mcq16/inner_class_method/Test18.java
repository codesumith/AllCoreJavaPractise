package com.sumith.mcq16.inner_class_method;

public class Test18
{
 public static void main(String[] args)
{
	
    B6 b = new C();
    A6 a = b;
    if (a instanceof A6) System.out.println("A");
    if (a instanceof B6) System.out.println("B");
    if (a instanceof C) System.out.println("C");
    if (a instanceof D) System.out.println("D");
  }
}

class A6 {}
class B6 extends A6 {}
class C extends B6 {}
class D extends C {}