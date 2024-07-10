package com.sumith.staticmethod;


class Supe
{
	public void access(int ...x)
	{
	  System.out.println("Var args method :"+x[0]);	
	}
}
class Subu extends Supe
{	
	public void access(int x)
	{
	  System.out.println("Instance method :"+x);	
	}
	
}
public class OverLoading {
	
	public static void main(String[] args) {
		
		Supe s= new Subu();
		s.access(5);
		
	}

}
