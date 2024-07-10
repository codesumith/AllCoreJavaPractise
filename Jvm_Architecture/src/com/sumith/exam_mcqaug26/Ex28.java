package com.sumith.exam_mcqaug26;
class Class {
	public void show() {
		System.out.print("Runtime exception  ");
	}
}
class Nit {
       // @Override
	public void show() {
		System.out.print("Nit  ");
	}
}
class Java extends Nit {
	@Override
	public void show() {
		System.out.print("Java  ");
	}
}
public class Ex28 {
	public static void main(String[] args) {
		Nit obj=new Java();
		obj.show(); 
		new Class().show();                               				
	}
}