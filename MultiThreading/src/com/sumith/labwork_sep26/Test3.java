package com.sumith.labwork_sep26;
public class Test3 extends Thread{

    public void run() {
    System.out.println("Writer run");
    }
    public static void main(String[] args) {
    Runnable c = new Test3();
    
    Thread t = new Thread(c);
    
    t.run();
    }
}