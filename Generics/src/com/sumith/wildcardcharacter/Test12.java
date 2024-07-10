package com.sumith.wildcardcharacter;

import java.util.ArrayList;
import java.util.List;

class Parent
{
	
}

class Child extends Parent
{
	
}

public class Test12 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<?> lp =new ArrayList<Parent>();
		System.out.println("Wild Card...");

	}

}
