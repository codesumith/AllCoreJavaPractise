package com.student.details;

import java.util.Map;

public class Student {
	
	private Integer id;
	private String name;
	private Map<String,Integer> marks;
	
	public Student()
	{
		System.out.println("Student created...");
	}
	
	
	//all params
	public Student(Integer id, String name, Map<String, Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
