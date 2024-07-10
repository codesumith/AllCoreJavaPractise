package com.sumith.exam_mcqaug26;

public class Ex6 {
	int a;

	Ex6() {
		this(m1(m2()));
		this.a += 100;
	}

	Ex6(int a) {
		this.a += a;
	}

	static int m1(int a) {
		return 200;
	}

	static int m2() {
		return 100;
	}

	public static void main(String[] args) {
		System.out.println(new Ex6().a);
	}

	{
		this.a = 100;
	}

}
