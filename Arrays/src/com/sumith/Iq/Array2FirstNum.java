package com.sumith.Iq;

public class Array2FirstNum {
	
  public static void main(String[] args) {
		
 int []a= {10,20,30,40,60};
 int []b= {70,30,60,70,50};
	  
	  
boolean c= firstLast(a,b);
System.out.println(c);
  }

public  static boolean firstLast(int[] a1,int[] b1) {
	
	if(a1[0]==b1[0] || a1[a1.length-1]==b1[b1.length-1]) 
		
		return true;
	
	else 
		
		return false;
	
	
	
}
  

	


}


