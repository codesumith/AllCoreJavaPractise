package com.sumith.supplier_interface;

public class Student {

	private int id;
	private String name;
	private String gender;
	private int age;
	
	public Student(int id,String name,String gender,int age) {
		super();
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	public String toString() {
		
		return "Student [ id = "+id+",Name = "+name+",Gender = "+gender+",Age = "+age+"]";
	}
}
