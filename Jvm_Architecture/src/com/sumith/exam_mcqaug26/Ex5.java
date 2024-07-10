package com.sumith.exam_mcqaug26;

public class Ex5 {
	int a = 100;

	Ex5() {
	}

	Ex5(Ex5 e) {
		e.a = 200;
		System.out.println(this.a);
	}

	void exchange(Ex5 e) {
		e.a = 300;
		System.out.println(e.a);
		e = new Ex5(e);
		System.out.println(e.a);
	}

	public static void main(String[] args) {
		Ex5 e = new Ex5();
		e = new Ex5(e);
		System.out.println(e.a);
		e.exchange(e);

	}

}