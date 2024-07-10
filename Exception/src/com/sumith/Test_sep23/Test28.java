package com.sumith.Test_sep23;

public class Test28 extends Thread {
	public static void main(String argv[]) {
		Test28 t = new Test28();
		t.run();
		t.start();
	}

	public void run() {
		System.out.println("run-test");
	}
}