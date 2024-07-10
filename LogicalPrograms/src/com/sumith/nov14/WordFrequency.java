package com.sumith.nov14;

public class WordFrequency {
	public static void main(String[] args) {
		
		String s ="hello hi hi ghj jhjh ghj";
		
		String c [] =s.split(" ");
		
		for(int i =0;i<c.length-1;i++)
		{
			if(c[i]!="*") {
			String l= c[i];
			int rep=1;
			
			
			for(int j =i+1;j<=c.length-1;j++) {
				String l1= c[j];
				if(l.equals(l1))
				{
					c[j]="*";
					rep++;
					
				}
				
			}
			if(rep>1)
			System.out.println(l+" is repeted "+rep+"times");
			}
		}

	}

}
