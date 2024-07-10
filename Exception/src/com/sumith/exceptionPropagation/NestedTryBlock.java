package com.sumith.exceptionPropagation;



public class NestedTryBlock {

	public static void main(String[] args) {
		
		
		try
		{
			String x= "sumith";
			System.out.println("It length is : "+ x.length());
			
			try
			{
				String y="Sumith";
				int z= Integer.parseInt(y);
				
				System.out.println("z value is : "+z);
			}
			catch(NumberFormatException e)
			{
				System.err.println("Number is not in a proper format");
			}
		}
		catch(NullPointerException e )
		{
			System.err.println("Null pointer exception");
		}
	}

}
