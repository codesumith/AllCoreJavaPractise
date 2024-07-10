package com.sumith.Test_sep23;

class One extends Thread {
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.print(i);
		}
	}
}

public class Test27 {
	public static void main(String args[]) {
		Test27 t = new Test27();
		t.call(new One());
	}

	public void call(One o) {
		o.start();
	}
}