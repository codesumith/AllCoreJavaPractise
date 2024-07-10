package com.sumith.nov14;

public class CharacterAccourance {

	public static void main(String[] args) {
		
		String s ="successfull";
		
		char c [] =s.toCharArray();
		
		
		for(int i =0;i<c.length-1;i++)
		{
			if(c[i]!='*') {
			char l= c[i];
			int rep=1;
			
			
			for(int j =i+1;j<=c.length-1;j++) {
				if(l==c[j])
				{
					c[j]='*';
					rep++;
				}
				
			}
			System.out.println(l+" is repeted "+rep+"times");
			}
		}

	}

}
