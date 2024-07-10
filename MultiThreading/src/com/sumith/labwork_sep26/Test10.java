package com.sumith.labwork_sep26;
public class Test10 implements Runnable {
public void run() {
	
//int div = 50 /0;

System.out.println("running…");

}

public static void main(String[] args)
{
//Test10 obj = new Test10();

Thread thread = new Thread(new Test10());

thread.start();
}
}