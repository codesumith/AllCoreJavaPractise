package com.sumith.zomato;

public class Zomato {

	public static void main(String[] args) {
		Order od=new Order(123,"Butterchiken",350);
		
		Customer cu= new Customer(1234,"Vikas","Balkampet",od);
		System.out.println(cu);
		
		
		

	}

}
