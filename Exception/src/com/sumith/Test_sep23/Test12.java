package com.sumith.Test_sep23;
class SuperClass{
public int doIt(String str, Integer...data)throws Exception{
String signature = "(String, Integer[])";
System.out.println(str + " " + signature);
return 1;
}
}

public class Test12 extends SuperClass{
public int doIt(String str, Integer... data){
String signature = "(String, Integer[])";
System.out.println("Overridden: " + str + " " +signature);
return 0;
}
public static void main(String... args) {
//SuperClass sb = new Test12();
//sb.doIt("hello", 3);
}
}
