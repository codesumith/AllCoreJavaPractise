package com.sumith.Creating_objects;

public class Fan {
	
	String name;
	String coil;
	int Wings;
	
	public void switchOn() {
		System.out.println("Fan on");
		System.out.println("Fan name is:"+name);
		System.out.println("Fan coil is:"+coil);
		System.out.println("Fan Wings are:"+Wings);
	}
	
	public void switchoff()
	{
		System.out.println("Fan off");
	}

	public static void main(String[] args) {
		
		Fan f= new Fan();
		f.name="bajaj";
		f.coil="copper" ;
		f.Wings=3 ;
		f.switchOn();
		f.switchoff();

	}

}
