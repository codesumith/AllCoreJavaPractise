package com.sumith.try_catch_blocks;

public class Finally_with_Catch {
	
	public static void main(String[] args) {
		
		try {
			int [] x=new int[-2];
			
			x[0]=12;
			x[1]=15;
			System.out.println(x[0]+" : "+x[1]);
		}
		catch(NegativeArraySizeException e )
		{
			System.err.println("Array size in negetive vlaue....");
		}
		finally
		{
			System.out.println("Resources will be handled here!!");
		}
		
		System.out.println("Main ended..!!");
	}

}
