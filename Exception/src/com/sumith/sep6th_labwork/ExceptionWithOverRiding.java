package com.sumith.sep6th_labwork;


class Parent{
	
	public void get() {
		System.out.println("Iam parent class method");
	}
	
}

class sub extends Parent {
	public void get() throws RuntimeException{
		System.out.println("Iam child class method");
		
	}
}

public class ExceptionWithOverRiding {

	public static void main(String[] args) {
		
Parent p=new sub();
p.get();

	}

}
