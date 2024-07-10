package com.sumith.mcq16.inner_class_method;

abstract class Test10
{  
 private void doSomething() 
 {  
 System.out.println("A");  
 } 
 
 public static void main(String [] args)
 {  
  Test10 a = new B();  
 a.doSomething();  
 }  
 } 
 

  class B extends Test10 
{  
protected void doSomething()
 {  
 System.out.println("B");  
 }  
 }  