package com.sumith.labwork_sep26;
public class Test8 extends Thread {
public void run() {
System.out.println(Thread.currentThread().getPriority());
}
public static void main(String[] args) throws InterruptedException 
{
Test8 t1 = new Test8();
Test8 t2 = new Test8();
t1.start();
t2.start();
}

}