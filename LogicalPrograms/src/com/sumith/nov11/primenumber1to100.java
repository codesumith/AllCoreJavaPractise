package com.sumith.nov11;

public class primenumber1to100 {

	public static void main(String[] args) {
		
  
  for(int i=0;i<=100;i++)
  {
	  int flag =0;
	  
	  if(i==0||i==1)
	  {
		  flag+=1;
	  }
	  else {
		  for(int j=2;j<=i-1;j++)
		  {
			  if(i%j==0)
			  {
				  flag+=1;
			  }
		  }
	  }
	  
	  if(flag==0)
	  {
		  System.out.print(i+" ");
	  }
  }
	}

}
