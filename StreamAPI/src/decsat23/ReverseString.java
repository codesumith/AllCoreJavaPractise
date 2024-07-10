package decsat23;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Ravider";
		String s1 = "redivaR";
		System.out.println(new StringBuilder(s).reverse());
		
		char [] c = s.toCharArray();Arrays.sort(c);
		char [] c1 =s1.toCharArray();Arrays.sort(c1);
		
		if(Arrays.equals(c,c1)) {
			System.out.println("True");
		}
		else System.out.println("False");
		
		int x = 15;
		System.out.println(-x); 
		System.out.println(-(-x));
		
		int b=30;
		
		int max = (x>b)?x:b;
		System.out.println("Max value is "+max);
	}
}
