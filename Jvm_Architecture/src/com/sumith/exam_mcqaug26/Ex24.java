package com.sumith.exam_mcqaug26;
public class Ex24 
{
  Ex24() {
      this(20);
      System.out.println("One");
   }
  Ex24(int i) {
      this(null); 
      System.out.println("Two");	 
    }
  Ex24(Ex24 test) {
       System.out.println("Three");	  
 }
public static void main(String[] args) 
{
    new Ex24();
 }
}