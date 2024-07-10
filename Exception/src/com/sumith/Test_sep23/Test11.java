package com.sumith.Test_sep23;
class MyClass{
public String test(){
try{
System.out.print("One");
return "";
}
finally{
System.out.print("Two");
}
}
}

public class Test11{
public static void main(String args[]){
MyClass m = new MyClass();
m.test();
}
}