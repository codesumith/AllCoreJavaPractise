package com.sumith.school;

public class Student {
	
	private String name;
	private int age;
	private double Gpa ;
	private Teacher teacher;
	
	public Student(String name, int age, double gpa, Teacher teacher) {
		super();
		this.name = name;
		this.age = age;
		Gpa = gpa;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return Gpa;
	}

	public void setGpa(double gpa) {
		Gpa = gpa;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void changeTecher(Teacher newTeacher) {
		this.teacher=newTeacher;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", Gpa=" + Gpa + ", teacher=" + teacher + "]";
	}

}
