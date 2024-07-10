package com.sumith.hierarchyOfConnection_oct3;

public class Access {
	
	//Anonymous inner class as implementation class
	public static ITest getRef() {
	ITest ob=new ITest()
			{
		public void m(int k)
		{
			System.out.println("***Implemented m(k)***");
			System.out.println("The value k:"+k);
		}
			};
			
			return ob;
			
	}
		
}
