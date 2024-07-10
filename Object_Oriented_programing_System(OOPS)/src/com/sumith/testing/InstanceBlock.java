package com.sumith.testing;

class Hi{
	int x=200,y=500;
	Hi(){
	System.out.println("X="+x);
	System.out.println("Y="+y);
	}
	{
		x=500;
		//System.out.println("Hello");
	}
	{
		x=5000;
		//System.out.println("Bully");
	}
	{
		x=-2;
		y=-5;
		//System.out.println("Mumbai");
	}
	public void m46() {
		System.out.println("Boom");
	}
}
public class InstanceBlock
{
	public static void main(String [] args)
	  {
	     new Hi().m46();
	  }
	}	
	
	
	
	
	
	
	
	

	
