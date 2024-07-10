package com.sumith.treemap;

public class Employee {

	int id ;
	String name;
	Integer age;
	public Employee(int id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
