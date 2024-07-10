package june8thtestPaper;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Percentage");
		int percentage=sc.nextInt();
		 
		boolean result=(percentage>=90)?true:false;
			if(result==true) System.out.println('A');
			boolean result1=(percentage<=90 && percentage>=70)?true:false;
			if(result1==true) System.out.println('A');
		
				
			
			sc.close();	

	}

}
