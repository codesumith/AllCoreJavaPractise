package com.sumith.test_sep16;
public class Test23and24{
public static void main (String[] args){
String test = "a1b2c3";
String[] tokens = test.split("\\d");
for(String s: tokens)
System.out.print(s);

//24

String S1 = "S1 ="+ "123"+"456";
String S2 = "S2 ="+(123+456);

System.out.println(S1);
System.out.println(S2);
}
}

