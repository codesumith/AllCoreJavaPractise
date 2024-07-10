package com.sumith.Test_sep23;

public class Test14 
{
public void divide(int a, int b)
{
	

try
{
//int c = a / b;
	

}
catch(Exception e)
{
System.out.print("Exception ");
}
finally
{
System.out.println("Finally");
}
}

	public static void main(String args[]) {
		Test14 t = new Test14();
		t.divide(0, 3);
	}
}