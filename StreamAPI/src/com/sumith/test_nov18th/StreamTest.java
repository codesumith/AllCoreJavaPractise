package com.sumith.test_nov18th;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {

	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

 public class StreamTest
 {
	 public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Alice",25));
		list.add(new Person("Charlie",25));
		list.add(new Person("Eve",25));
		list.add(new Person("Bob",30));
		list.add(new Person("David",30));
		
		List<Person> str =list.stream().filter(p -> p.age==25).collect(Collectors.toList());
		System.out.println("Persons with age  25");
		str.forEach(p -> System.out.println(p.name));
		
		System.out.println();
		
		List<Person> str2 =list.stream().filter(p -> p.age==30).collect(Collectors.toList());
		System.out.println("Persons with age 30");
		str2.forEach(p -> System.out.println(p.name));
		
	}
 }