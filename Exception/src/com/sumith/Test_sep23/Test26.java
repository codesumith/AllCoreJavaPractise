package com.sumith.Test_sep23;

public class Test26 implements Runnable {
	public static void main(String[] args) {
		//Test26 t = new Test26();
	}

	public Test26() {
		Thread t = new Thread(this);
		t.start();
	}

public void run(){
System.out.println("test");
}
}