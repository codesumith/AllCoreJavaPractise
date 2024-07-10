package com.apollo.main;

import com.apollo.prouducts.HealthCare;
import com.apollo.prouducts.Product;

public class Start {
	
	
	/*
	 * private int id;
	private String name;
	private String doctor;
	private String area;
	private double consultancyFee;
	 */
	
	public static void main(String[] args) {
		
		HealthCare h1 = new HealthCare();
		
		HealthCare p1 = new HealthCare(1,"Dentist","Anand","kukatpally",500);
		HealthCare p2 = new HealthCare(2,"ENT","Ravi","JubliHills",400);
		
		h1.addProduct(p1);
		h1.addProduct(p2);
		
	    h1.display();
		
	}

}
