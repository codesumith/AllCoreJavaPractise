package com.sumith.exam_mcqaug26;
class Nareshit {
	public void show() {
		System.out.println("Nit");
	}
}
class JGP extends Nareshit {
	@Override
	public void show() {
		System.out.println("Java");
	}
}
public class Ex30 {
	JGP obj=null;
	public static void main(String[] args) {
		//JGP obj=new Nareshit();
		//obj.show();   								
	}
}
