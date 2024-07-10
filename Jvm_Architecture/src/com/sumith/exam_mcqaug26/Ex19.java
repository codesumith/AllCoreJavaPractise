package com.sumith.exam_mcqaug26;
class Sample2 {
	static int a =10;//30
	static int b;//20
	static {
		System.out.println(a);
	}
	
	public  void add(int a ,int b) {
		System.out.println(a+b);
	}
	static {
		b=20;
		a=30;
	}
}
public class Ex19{//50 10 50
	static int a=50;
	public static void main(String[] args) {
		new Sample2().add(Sample2.a,Sample2.b);
	}
	static {
		System.out.println(a);
	}
	
		
}