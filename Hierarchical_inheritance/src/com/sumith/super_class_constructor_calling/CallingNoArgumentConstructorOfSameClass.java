package com.sumith.super_class_constructor_calling;

class Parent{
	
	public Parent() {
		
		
		System.out.println("no argument constructor of super class");
	}
	
	public Parent(int x) {
		
		this();
		System.out.println("paremterized constructor of super class"+x);
		
	}
}
	class Child extends Parent{
		
		public Child(int x)
		{
			super(x);
			System.out.println("parmeterized constructor of sub class");
		}
		
	}


public class CallingNoArgumentConstructorOfSameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new Child(9);
	}

}
