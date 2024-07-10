package com.sumith.TypeErasure;

import java.util.ArrayList;

class Parent
{
	
}

class Child extends Parent
{
	
}

public class Test11 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//ArrayList<Parent> lp=new ArrayList<Child>();
		
		ArrayList<Parent> lp1 =new ArrayList<Parent>();
		
		ArrayList<Child> lp2 =new ArrayList<>();
		
		System.out.println("Success");

	}

}
