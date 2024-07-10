package com.sumith.human_heart;

public class Main {

	public static void main(String[] args) {
		
	Heart h=new Heart(75, "RED");
	
	Humans hm= new Humans("SRAVANI", "FEMALE", h);
	System.out.println(hm);
	hm.talk();
	hm.walk();
	hm.sleep();
	}

}
