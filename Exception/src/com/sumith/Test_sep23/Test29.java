package com.sumith.Test_sep23;
class A1 implements Runnable{
public void run(){
System.out.println("run-a");
}
}
public class Test29{
public static void main(String... args){
A1 a = new A1();
Thread t = new Thread(a);
t.start();
t.start();
}
}

