package com.sumith.instance_block;

public class Person {

	private String name;
	private int age;
	
	
	{
		
		System.out.println("Person instance created");
		
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		
		System.out.println("Hi my name is {"+name+"} and I'm {"+age+"} years old.");
		
	}
	public static void main(String[ ]args) {
	Person p=new Person("Gaurav", 24);
	Person p1=new Person("Mohan", 34);
	p.introduce();
	p1.introduce();
	}

}
