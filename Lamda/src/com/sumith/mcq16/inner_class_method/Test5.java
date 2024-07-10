package com.sumith.mcq16.inner_class_method;

class Base1
{
    int value=0;
    Base1()
	{
    addValue();
    }
    void addValue(){
    value += 10;
    }
   int getValue(){
     return value;
   }
 }
class Derived1 extends Base1{
  Derived1()
  {
   addValue();
  }
 void addValue(){
	 super.addValue();
 value +=  30;
  }
}
public class Test5 {
  public static void main(String[] args){
      Derived1 b = new Derived1();		  
      System.out.println(b.getValue());
  }
}
