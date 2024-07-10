package com.sumith.lab_sep4;
class InnerTry 
{
	public static void main(String[] args) 
	{
		try
		{
			//String s=null;
			//System.out.println(s.length());
		}
		catch (NullPointerException np)
		{
			System.out.println("Null Problem");
			try
			{
				String s="xyz";
				int no=Integer.parseInt(s);
				System.out.println(no);
			}
			catch (NumberFormatException nf)
			{
				System.out.println("Number Format Problem");
			}
		}
		System.out.println("Completed");
	}
}

