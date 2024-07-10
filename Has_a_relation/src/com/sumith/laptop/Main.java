package com.sumith.laptop;

public class Main {

	public static void main(String[] args) {
		
		MotherBoard mb=new MotherBoard("intel", "1TB", "16GB");
		
		Laptop l=new Laptop("Dell", "PRO", 65000,mb);
		System.out.println(l);
		MotherBoard mb1=new MotherBoard("M1", "512gb", "16GB");
		Laptop l1=new Laptop(l);
		l1.setLaptopCompany("apple");
		l1.setModel("MackBook PRO");
		l1.setPrice(185000);
		l1.setMk(mb1);
		System.out.println(l1);

	}

}
