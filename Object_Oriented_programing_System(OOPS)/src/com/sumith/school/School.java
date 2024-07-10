package com.sumith.school;

public class School {

private String name;
private String location;
private Student students;
private Principal  principal;

public School(String name, String location, Student students, Principal principal) {
	super();
	this.name = name;
	this.location = location;
	this.students = students;
	this.principal = principal;
}

public School(School object) {
	super();
	this.name = object.name;
	this.location = object.location;
	this.students = object.students;
	this.principal = object.principal;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public Student getStudents() {
	return students;
}

public void setStudents(Student students) {
	this.students = students;
}

public Principal getPrincipal() {
	return principal;
}

public void setPrincipal(Principal principal) {
	this.principal = principal;
}

	public void addStudent(Student student) {
		this.students=student;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", location=" + location + ", students=" + students + ", principal=" + principal
				+ "]";
	}
	
}
