package com.sumith.exam_mcqaug26;

class Foo{
	public int a = 3;

	public void addFive() {
		a += 5;
		System.out.print("f ");
	}
}

class Ex8 extends Foo{       //b 3
public int a = 8; 
public void addFive() { 
this.a += 5; System.out.print("b " ); 
} 
public static void main(String[] args) {
	Foo f=new Ex8();
	f.addFive();
	System.out.println(f.a);
}
} 
