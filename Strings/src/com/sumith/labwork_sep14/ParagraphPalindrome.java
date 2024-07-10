package com.sumith.labwork_sep14;

public class ParagraphPalindrome {
	public static void paragraphPalindrome(String paragraph) {
		
		  String []ch= paragraph.split(" ");
	       int pal=0;
	        
	      for(int i=0;i<ch.length;i++){
	    	  String st=ch[i];
	          
	    	  String rev="";
	            	for(int l=st.length()-1;l>=0;l--) {
	            		
	            		rev+=st.charAt(l);
	            		
	            	}
	            	if(st.equals(rev)) {
	            		System.out.println(ch[i]+" is a pallindrome");
	            		pal++;
	            	}
	            	st=null;
	       }
System.out.println("Count of the pallindrome present in the paragraph is :- "+pal);
	}

	public static void main(String[] args) {
		 String s="Hi mam my name us LERREL and familier with MalayalAm";
	     
		 paragraphPalindrome(s);
	}

}
