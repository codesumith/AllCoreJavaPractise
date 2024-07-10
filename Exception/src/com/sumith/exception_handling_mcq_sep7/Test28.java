package com.sumith.exception_handling_mcq_sep7;
class Sample{

public String test()

{

 try {

      System.out.println("one");

      return "hello";

 }

 finally {

      System.out.println("two");

 }
}

}

public class Test28

{

public static void main(String[] args) {

Sample s=new Sample();

s.test();
}

}