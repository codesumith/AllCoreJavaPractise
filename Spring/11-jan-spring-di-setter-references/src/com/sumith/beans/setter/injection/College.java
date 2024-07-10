package com.sumith.beans.setter.injection;

public class College {
	
	private String clgName;
	private Student student;
	
	public College()
	{
		System.out.println("College created");
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		System.out.println("Setting student in college");
		this.student = student;
	}
	
	

}
