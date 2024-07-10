package com.sumith.test;

public class Test10 {
	
	public static void main(String[] args) {
		
		Product p= () ->{
			int price =100;	System.out.println("Hidenseek price is"+price);
			};
			p.price();
		
}

}

@FunctionalInterface
interface Product{
	
	void price();
	
}
	
	


