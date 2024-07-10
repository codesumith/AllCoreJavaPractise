package com.sumith.exam_mcqaug26;

class A {
	static {
		System.out.print("2");
		//new Ex2(3).main(new String[] {});
	}
}

public class Ex2 {
	Ex2(int a) {
		System.out.print(a);
	}

	public static void main(String[] args) {
		new A();
	}

	{
		System.out.print(" 1 ");
	}
}
