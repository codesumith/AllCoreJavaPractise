package com.sumith.beans.setter.injection;

import java.util.List;

public class Student 
{
	
	private int id ;
	private String name;
	private List<Long> mobile;
	
	public Student()
	{
		System.out.println("Student created");
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

	public List<Long> getMobile() {
		return mobile;
	}

	public void setMobile(List<Long> mobile) {
		this.mobile = mobile;
	}
	
	

}
