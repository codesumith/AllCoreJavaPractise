package com.sumith.beans.setter.injection;

import java.util.List;

public class Student {
	
	private int id ;
	private String name;
	private List<Long> mobileNumber;
	
	public Student()
	{
		System.out.println("Student created..");
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
	public List<Long> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(List<Long> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
