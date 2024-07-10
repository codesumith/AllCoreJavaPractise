package com.sumith.cake;

public class CakeMain {

	public static void main(String[] args) {
		
		OrderedCake oc=new OrderedCake("Round", "Vanilla", 3, "Happy Birthday");
		oc.showCake();
		
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		
        OrderedCake uc=new OrderedCake("Heart", "Choclate", 2);
		uc.showCake();
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		
		OrderedCake sc=new OrderedCake("Rectangle", "StrawBerry", 10,"Happy Anniversary");
			sc.showCake();
	}

}
