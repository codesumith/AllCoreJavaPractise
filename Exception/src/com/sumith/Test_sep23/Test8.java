package com.sumith.Test_sep23;
class Person{
public void talk() {}
}

public class Test8{
public static void main(String args[]){
//Person p = null;
try{
//p.talk();
}
catch(NullPointerException e){
System.out.print("There is a NullPointerException. ");
}
catch(Exception e){
System.out.print("There is an Exception. ");
}
System.out.print("Everything went fine. ");
}
}