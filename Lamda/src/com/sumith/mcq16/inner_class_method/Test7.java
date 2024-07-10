package com.sumith.mcq16.inner_class_method;

interface ITest
{
     public void setVal();
}


public class Test7  
	  {
    private String a;
    void aMethod()
		  {
    final String b="World";
    ITest it = new ITest() 
		   {
         public void setVal()
		   {
         a = "Hello";               
         }
		   };
    it.setVal();
    System.out.println(a + b);
    }
    public static void main(String[] args)
    {
    Test7 t = new Test7();
    t.aMethod();
    }
 }