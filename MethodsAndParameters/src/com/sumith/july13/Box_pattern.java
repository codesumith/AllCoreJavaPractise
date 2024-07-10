package com.sumith.july13;



public class Box_pattern {

	public String createBoxPattern(int rows,int cols) {
		String	box ="";
		if(rows<0||cols<0) return"-1";
		else if(rows==0||cols==0) return"-2";
		
		else {
			for(int r=1;r<=rows;r++) {
				for(int c=1;c<=cols;c++) {
					if(r==1||c==1||r==rows) {
						box=box+"* ";
						
					}
					else if(c==cols) {
						box=box+"*";
						
					}
					
						
					
				else {
						box=box+"  ";
						
					}
					
					
				}
				box=box+"\n";
			}
		}
		
		
		
		return box;
	}
		
		
		
	
		public static void main(String[]args) {
			Box_pattern b=new Box_pattern();
			System.out.println(b.createBoxPattern(4,5));
		}
}
	


