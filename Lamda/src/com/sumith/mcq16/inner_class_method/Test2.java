package com.sumith.mcq16.inner_class_method;

interface A
{
public void innerMeth();
}
public class Test2 
{
  A a;
  int memVar = 1;
void aMethod()
	{
   a = new A()
		{
   public void innerMeth()
		{
       System.out.println(memVar);
       } 
		};
   }
 public static void main(String[] args)
	  {
           Test2 t = new Test2();
            t.a.innerMeth();//error null pointer exception;
			 t.aMethod();
			 
     }
     }
