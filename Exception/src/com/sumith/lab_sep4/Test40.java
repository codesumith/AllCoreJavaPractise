package com.sumith.lab_sep4;
public class Test40{
   public static void main(String[] args) throws Exception
	{
      System.out.println("Enter main()");//1
      try
      {
		methodA();
      }
      catch (Exception e)
      {
		  System.out.println(e);
      }
      System.out.println("Exit main()");
   }
 
   public static void methodA() throws Exception
	   {
      System.out.println("Enter methodA()");//2
      methodB();
      System.out.println("Exit methodA()");
   }
 
   public static void methodB() throws Exception
	   {
      System.out.println("Enter methodB()");//3
      	methodC();
      System.out.println("Exit methodB()");
   }
 
   public static void methodC() throws Exception
	   {
      System.out.println("Enter methodC()");//4
       System.out.println(1/0);
      System.out.println("Exit methodC()");
   }
}
