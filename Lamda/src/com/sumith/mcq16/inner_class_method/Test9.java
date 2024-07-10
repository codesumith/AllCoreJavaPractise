package com.sumith.mcq16.inner_class_method;

interface ITest1
	{
    public void setVal();
   }

   public class Test9 
	 {
     private String a;
     void aMethod()
	 {
     final String b = " World";
     ITest it = new ITest() {
                  public void setVal(){
                  a = "Hello" + b;
                  }};
     it.setVal();
     System.out.println(a);
     }
     public static void main(String[] args) {
     Test9 t = new Test9();
     t.aMethod();
     }
   }