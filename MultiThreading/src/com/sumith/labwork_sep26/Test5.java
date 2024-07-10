package com.sumith.labwork_sep26;
public class Test5 {

public static void main (String[] args) {
     new Test5().go();
    }
     public void go() {
   
    	 Runnable r = new Runnable() {
    public void run() {
    System.out.print("foo ");
     }
     };
     
     Thread t = new Thread(r);
     t.start();
     t.start();
     
     }
}