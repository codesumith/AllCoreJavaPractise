package com.sumith.testing;

class Base{
    static  int value = 0;
      Base(){
      addValue();
      }
  static void addValue(){
      value += 10;
      }
     int getValue(){
       return value;
     }
   }
  class Derived extends Base{
    Derived(){
     addValue();
    }
  static void addValue(){
   value +=  20;
    }
  }
  public class Test6 {
    public static void main(String[] args){
        Base b = new Derived();
        System.out.println(b.getValue());
    }
  }