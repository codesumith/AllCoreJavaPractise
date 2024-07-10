package com.sumith.labwork_sep26;
public class MyThread11 implements Runnable {
public void run() {
System.out.println("running…");
}
public static void main(String[] args) {
Thread thread = new Thread(new MyThread11());


thread.start();
System.out.println(thread.isDaemon());

}
}