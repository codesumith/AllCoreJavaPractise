package com.sumith.anonymous_inner_class;

public class AnonymousInnerWithclass {

	public static void main(String[] args) {
		
Base derived =new Base()
{
	@Override
	public void display() {
		System.out.println("Display method of derived class");
		
	}
};
derived.display();
	}

}
