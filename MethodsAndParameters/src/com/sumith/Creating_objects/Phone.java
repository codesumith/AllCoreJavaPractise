package com.sumith.Creating_objects;

public class Phone {

	String name;
	String model;
	int price;
	
	public void getPhoneDetails() {
		System.out.println("My Phone name is:"+name);
		System.out.println("My Phone model is:"+model);
		System.out.println("Phone price:"+price);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Phone p=new Phone();
		p.name="iphone";
		p.model="9Plus";
		p.price=85000;
		p.getPhoneDetails();
		
		

	}

}
