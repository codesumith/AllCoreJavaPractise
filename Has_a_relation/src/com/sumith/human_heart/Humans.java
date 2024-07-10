package com.sumith.human_heart;

public class Humans {
	
	private String name;
	private String gender;
	private Heart  ht;
	
	
	public Humans(String name, String gender, Heart ht) {
		super();
		this.name = name;
		this.gender = gender;
		this.ht = ht;
	}
	
	public void walk() {
		
		System.out.println(name+" is walking");
	}
public void talk() {
	
	System.out.println(name+" is talking");
}
public void sleep() {
	System.out.println(name+" is sleeping");
}


@Override
public String toString() {
	return "Humans [name=" + name + ", gender=" + gender + ", ht=" + ht + "]";
}

}
