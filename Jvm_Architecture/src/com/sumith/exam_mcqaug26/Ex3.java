package com.sumith.exam_mcqaug26;

public class Ex3 {
	static Ex3 e = new Ex3();
	int a = m1();
	static {
		Ex3.e.a = Ex3.e.a * 2;
	}
	{
		this.a = this.a * 2;
	}

	Ex3() {
		System.out.println(this.a);
	}

	int m1() {
		return 8;
	}

	public static void main(String[] args) {
		//Ex3 e = new Ex3();
		System.out.println(Ex3.e.a);
	}

}
