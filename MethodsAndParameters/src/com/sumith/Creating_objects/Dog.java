package com.sumith.Creating_objects;



public class Dog {
	
	String name;
	String color;
	double height;
	double age;
	
	public void getDogInforamtion()
	{
		System.out.println("My Dog name is:"+name);
		System.out.println("My Dog colour is:"+color);
		System.out.println("My dog height is:"+height);
		System.out.println("My dog age is:"+age+"Years");
	}

	public void bark()
	{
		System.out.println("My Dog barking");
	}
	
	public static void main(String[]args) 
	{
		Dog d=new Dog();
		d.name="Snoopy";
		d.color="pink";
		d.height=3.6;
		d.age=2.5;
		d.getDogInforamtion();
		d.bark();
	}
}
