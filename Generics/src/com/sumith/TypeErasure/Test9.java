package com.sumith.TypeErasure;

import java.util.ArrayList;
import java.util.List;

abstract class Animal2
{
public abstract void checkup();	
}

class Dog2 extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Dog Checkup");
		
	}
	
}
class Cat2 extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Cat Checkup");
		
	}
}

class Bird2 extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Bird Checkup");
		
	}
}

public class Test9 {

	public void checkAnimals(List<Animal> animals)
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Dog2> dogs =new ArrayList<>();
		dogs.add(new Dog2());
		dogs.add(new Dog2());
		
		List<Cat2> cats =new ArrayList<>();
		cats.add(new Cat2());
		cats.add(new Cat2());
		cats.add(new Cat2());
		
		List<Bird2> birds=new ArrayList<>();
		birds.add(new Bird2());
		
		Test9 t=new Test9();
//		t.checkAnimals(dogs);
//		t.checkAnimals(cats);
//		t.checkAnimals(birds);
	}
}
//note : The above program will generate the compilation error.

//So from above program it is clear that polymorphism does not work in the same way for 
//generics as it does with arrays.