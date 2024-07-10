package com.sumith.default_method;

public class Main {

	public static void main(String[] args) {
		
		HotDrink h;
		h=new Tea();h.prepare();h.expressPrepare();
		
		System.out.println("-------------------------------------------------");

		h=new Coffe();h.prepare();
		
	}

}
