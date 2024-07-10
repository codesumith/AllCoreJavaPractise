package com.sumith.test_sep16;
public class Test8and9 {

@SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
    String s1 = "abc";
    StringBuffer s2 = new StringBuffer(s1);
    System.out.println(s1.equals(s2));
    
    
    //9
    
    String str = "Hello";
    str += " World!";
    System.out.println(str.length());
}
}
