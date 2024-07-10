package com.sumith.exam_mcqaug26;
class Sample1 {
	static int a =10;
	static int b=assign();
	static {
		System.out.println(a);
	}
	
	public static int assign() {
		System.out.println(a);
		return 20;
	}
}
public class Ex18{//30 10 10 40
	static int a =30;
	public static void main(String[] args) {
		System.out.println(a+Sample1.a);
	}
	static {
		System.out.println(a);
	}
	
		
}
