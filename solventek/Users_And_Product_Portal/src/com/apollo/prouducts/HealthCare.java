package com.apollo.prouducts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HealthCare implements Product{
	
	private int id;
	private String name;
	private String doctor;
	private String area;
	
	private double consultancyFee;
	
	List<Product> listOfHealthCare = new ArrayList<>();;
	
	public HealthCare() {
		super();
		
	}

	public HealthCare(int id, String name, String doctor, String area, double consultancyFee) {
		super();
		this.id = id;
		this.name = name;
		this.doctor = doctor;
		this.area = area;
		this.consultancyFee = consultancyFee;
	}

	
	
	@Override
	public void addProduct(Product product) {
		
		 listOfHealthCare.add(product);
		
	}

	@Override
	public void display() {
		
		Iterator<Product> iterator = listOfHealthCare.iterator();
		while(iterator.hasNext()) {
			HealthCare hc= (HealthCare) iterator.next();
			System.out.println(hc);
		}
		
	}

	@Override
	public String toString() {
		return "HealthCare [id=" + id + ", name=" + name + ", doctor=" + doctor + ", area=" + area + ", consultancyFee="
				+ consultancyFee + "]";
	}
	
	
	

}
