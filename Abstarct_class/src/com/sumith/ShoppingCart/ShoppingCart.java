package com.sumith.ShoppingCart;

public class ShoppingCart {
	
	
	public static void main(String [] args) {
		
		ElectronicProduct ep=new ElectronicProduct("Iphone 14plus", 89000, 1);
		ep.calculateTotalPrice();
		System.out.println(ep.getDetails());
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		ClothingProduct cp=new ClothingProduct("jeans",3500 ,"32" );
		cp.calculateTotalPrice();
		System.out.println(cp.getDetails());
		
	}

}
