package com.sumith.exam_mcqaug26;
class Foo1 {
	public void show() {
		System.out.println("Hello");
	}
}
class Ex26 extends Foo1 {
	@Override
	public void show() {
		System.out.println("Hii");
	}
}
public class ClassB {
	public static void main(String[] args) {
		new Ex26().show();    						
	}
}
