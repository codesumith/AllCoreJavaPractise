package com.flipkart.set.values;

import java.util.Map;
import java.util.Set;

public class Student 
{
private int id;
private String name;
private Set<String>subjects;

private Map<String,Double> marks;

public Student()
{
	System.out.println("Student created...");
}

public Student(int id)
{
	System.out.println("Student created...");
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Set<String> getSubjects() {
	return subjects;
}

public void setSubjects(Set<String> subjects) {
	this.subjects = subjects;
}

public Map<String, Double> getMarks() {
	return marks;
}

public void setMarks(Map<String, Double> marks) {
	this.marks = marks;
}


}
