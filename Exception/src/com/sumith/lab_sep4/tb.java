package com.sumith.lab_sep4;

import java.util.Scanner;

public class tb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String pin;
		int num=3;
		
		
     
      do{
    	  System.out.print("Enter 4 digit pin : ");
		   pin=sc.next();
		   
		   if(pin.length()!=4) {
				System.out.println("please enter pin in 4 digits ");
				 System.out.println("------------------------------");
			}
		
		if(pin.length()==4) {
			  
		
			if(pin.equals("1111") ||pin.equals("2222") ||pin.equals("3333") ) {
		    	  
		    	  System.out.println("Exist");
		    	  break;
		      }
			
		      else {
		    	  System.out.println("pin do not exist");
		    	  
		    	  System.out.println("------------------------------");
		    	 pin="3";
		    	  num--;
		      }
			  if(num==0) {
				  System.out.println("Transaction Blocked");
				  break;
			  }
			
		}
		
		
		}
     while(pin.length()!=4&&num>=0);
		
      sc.close();
    
		}
	}


