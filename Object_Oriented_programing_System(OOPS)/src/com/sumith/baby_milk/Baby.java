package com.sumith.baby_milk;

public class Baby {
	
	private String babyName;
	private double babyAge;
	private String milkType;
	
	
	public Baby(String babyName, double babyAge, Milk milk) {
		super();
		this.babyName = babyName;
		this.babyAge = babyAge;
		
		
		if(milk.getMilkPrice()  <=60) {	
			milkType="Tonned Milk";
			}
		
		
		else { 
			milkType="Full Cream";
			}
		
		
	}


	@Override
	public String toString() {
		return "Baby [babyName=" + babyName + ", babyAge=" + babyAge + ", milkType=" + milkType + "]";
	}
	
	
	

}
