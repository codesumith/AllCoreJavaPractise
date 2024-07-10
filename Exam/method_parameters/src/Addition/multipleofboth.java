package Addition;

import java.util.*;

public class multipleofboth {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("a=");
		int a=sc.nextInt();
		
		boolean z=a%3==0 && a%5==0 ?true:false;
			System.out.println(z);
}
}