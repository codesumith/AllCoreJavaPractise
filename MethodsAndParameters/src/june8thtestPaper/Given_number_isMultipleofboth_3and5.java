package june8thtestPaper;

import java.util.Scanner;

public class Given_number_isMultipleofboth_3and5 {

	public static void main(String[] args) {
		     Scanner sc= new Scanner (System.in);
		     System.out.print("Enter a Number:");
		     int num=sc.nextInt();
		     boolean result= (num%3==0)&&(num%5==0)?true:false;
		      if (result==true) System.out.println("Multiple");
		      
		      else System.out.println("Not a multiple");
		      sc.close();
		     

	}

}
