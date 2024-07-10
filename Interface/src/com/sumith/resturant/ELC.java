package com.sumith.resturant;

public class ELC {

	public static void main(String[] args) {
		
		Restaurant rr=new Restaurant();
		rr.createObject(new Tea());
		rr.createObject(new Coffee());
		rr.createObject(new Horlicks());
		
		

	}

}
