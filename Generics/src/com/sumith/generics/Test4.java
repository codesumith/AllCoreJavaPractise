package com.sumith.generics;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		Dog d1 =new Dog();
		Dog d2 =d1.getDogList().get(1);
		System.out.println(d2);
	}
}

class Dog
{
	public List<Dog> getDogList()
	{
		List<Dog> d=new ArrayList<>();
		d.add(new Dog());
		d.add(new Dog());
		return d;
	}
}
