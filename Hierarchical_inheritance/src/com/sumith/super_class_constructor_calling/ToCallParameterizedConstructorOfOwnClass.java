package com.sumith.super_class_constructor_calling;


 class Base {
	
	Base(){
		this("Nit");
		System.out.println("Base class no arg const");
	}
	
	Base(String msg){
		
		System.out.println("Base class param const"+msg);
	}
	
 }
	
	class Derived extends Base{
		
		Derived(){
			
			System.out.println("Derived class no arg const");
		}
		
	}


public class ToCallParameterizedConstructorOfOwnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Derived();

	}

}
