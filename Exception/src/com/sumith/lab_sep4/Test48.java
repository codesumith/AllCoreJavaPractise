package com.sumith.lab_sep4;
public class Test48
{
	public static void main(String [] args)
	{
		String test="yes";
		try
		{
			System.out.println("Start try");//1
			doRisky(test);
			System.out.println("End try");
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled");//3
		}
		finally
		{
			System.out.println("Finally");//4
		}
		System.out.println("End of main");//5
	}
	static void doRisky(String test) throws Exception
	{
		System.out.println("Start risky");//2
		if("yes".equals(test))
		{
			throw new Exception();
		}
		System.out.println("End Risky");
		return;
	}
}
