package com.sumith.super_class_constructor_calling;


class Super{
	
	 Super(String message){
		
		System.out.println("super class constructor"+message);
		
	}
	
}

class Sub extends Super{
	
	Sub(){
		super("HI");
		System.out.println("sub class constructor");
	}
	
}
public class CallingParameterizedConstructorOfSuperclass {

	public static void main(String[] args) {
		new Sub();
	}

}
