package com.sumith.static_method;

public class StaticMethod {

	public static void main(String[] args) {
		
HotDrink hk1=new Tea();
HotDrink hk2=new Coffee();
HotDrink.expressPrepare();;
hk1.prepare();
hk2.prepare();
	}

}
