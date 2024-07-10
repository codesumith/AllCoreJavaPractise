package com.sumith.test_sep16;
public class Test25{
@SuppressWarnings("unlikely-arg-type")
public static void main(String args[]){
String s = "what";
StringBuffer sb = new StringBuffer("what");
System.out.print(sb.equals(s)+","+s.equals(sb));
}
}