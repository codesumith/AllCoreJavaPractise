package com.sumith.user_define_exception;

class Parent{
	public void m1() throws InterruptedException{
		System.out.println("Parent class m1 method");
	}
	
}

class Child extends Parent{
	
	public void m1() //throws InterruptedException 
	{
		try {
		super.m1();
		}
		//System.out.println("child class m1 method");
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class Clalling_Super_Class_Method_witih_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c=new Child();
c.m1();
	}

}
