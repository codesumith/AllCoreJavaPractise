package com.sumith.details;

import java.io.Serializable;


@SuppressWarnings("serial")
public class PersonalDetails implements Serializable{

	private String name;
	private String age;
	private String mobile;
	private String gender;
	private String[] hobbies;
	
	
	public PersonalDetails() {	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String[] getHobbies() {
		return hobbies;
	}


	public void setHobbies(String[] strings) {
		this.hobbies = strings;
	}


	@Override
	public String toString() {
		return "PersonalDetails [name=" + name + ", age=" + age + ", mobile=" + mobile + ", gender=" + gender
				+ ", hobbies=" + hobbies+ "]";
	}
	
	
	
	
}
