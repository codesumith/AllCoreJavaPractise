package com.sumith.super_class_constructor_calling;

 class A{
	
	public A() {
		
		System.out.println("A");
	}
 }
	
	class B extends A{
		
		public B(){
			
			System.out.println("B");
			
		}
		
	}

 public class CallingNoArgumentConstructorOfSuperclass{
	
	public static void main(String[]args) {
		
		new B();
	}
	
}
