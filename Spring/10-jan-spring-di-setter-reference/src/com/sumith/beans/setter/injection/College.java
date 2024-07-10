package com.sumith.beans.setter.injection;

public class College 
{
	private String name;
	private Student student;
	
	public College()
	{
		System.out.println("College created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	

}
