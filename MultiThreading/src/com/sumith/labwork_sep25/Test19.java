package com.sumith.labwork_sep25;

public class Test19 extends Thread {

	public static void main(String[] args) throws Exception {
		Test19 t = new Test19();
		t.start();
		t.join();
		t.method();
	}

	public void run() {
		System.out.println("run");
	}

	public void method() {
		hello();
		System.out.println("method");
	}

	public void hello() {
		hello1();
		System.out.println("PR");
	}

	public void hello1() {

		System.out.println("RR");
	}
}
