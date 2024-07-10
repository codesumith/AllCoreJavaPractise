package com.sumith.labwork_sep14;

public class Frequency_OF_Characters_in_A_Stirng {

	public static void main(String[] args) {
		
		String s="Hello Everyone";
		
		char []ch=s.toCharArray();
		char c = "COMPUTER".charAt("COMPUTER ".indexOf('P'));
		System.out.println(c);
		
		int n;
		
		for(int i=0;i<ch.length-1;i++) {
			n=1;
			for(int j=i+1;j<ch.length;j++)
			{
				
				if(ch[i]==ch[j]) {
					n++;
					ch[j]='*';
				}
				
			}
			if(ch[i]!='*') {
				if(ch[i]==32) {
					System.out.println("The frequency of space is "+n);
				}
				else
			System.out.println("The frequency of "+s.charAt(i)+" is "+n);
			}
		}

	}

}
