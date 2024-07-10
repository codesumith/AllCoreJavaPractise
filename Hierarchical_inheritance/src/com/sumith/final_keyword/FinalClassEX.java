package com.sumith.final_keyword;


 final class A
{
	 int x = 100;
	public void setData()
	{
		x = 120;
		System.out.println(x);
	}
}
/*class B extends A //error
{   
	
}

public class FinalClassEX {
	
	public static void main(String[] args) {
B b1= new B();
 b1.setData();

}
}*/