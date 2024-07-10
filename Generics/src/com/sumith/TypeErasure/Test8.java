package com.sumith.TypeErasure;

//BEHAVIOR OF POLYMORPHISM WITH ARRAY AND GENERICS


abstract class Animal
{
public abstract void checkup();	
}

class Dog extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Dog Checkup");
		
	}
	
}
class Cat extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Cat Checkup");
		
	}
}

class Bird extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Bird Checkup");
		
	}
}


public class Test8 {
	
	public void checkAnimals(Animal animals[])
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}
	public static void main(String[] args) {
		Dog [] dogs = {new Dog(),new Dog()};
		
		Cat [] cats = {new Cat(),new Cat(),new Cat()};
		
		Bird [] birds = {new Bird(),new Bird()};
		
		Test8 t =new Test8();
		t.checkAnimals(dogs);
		t.checkAnimals(cats);
		t.checkAnimals(birds);
	}

}
//IN ABOVE PROGRAM IT IS CLEAR THAT POLYMORPHISM(Up casting) Concept works with Array