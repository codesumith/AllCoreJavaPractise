package june8thtestPaper;

import java.util.Scanner;

public class Sumof_evenNumbers {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Number:");
	    int num1=sc.nextInt();
	    System.out.print("Enter Ending Number:");
	    int num2=sc.nextInt();
		int sum=0;
	    for(int i=num1;i<=num2;i++)
	    {
	    	if(i%2==0)
	    	{
	    		 sum+=i;
	    	}
	    }
	    
	    System.out.println(sum);
    	sc.close();
    
		
		
		
		
		
		
		
		
		
	}

}
