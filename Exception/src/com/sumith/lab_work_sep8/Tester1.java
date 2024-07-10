package com.sumith.lab_work_sep8;
//Import File Here
import java.util.Scanner;

class SimpleExceptionDemo {
    
    public  int divide(int a, int b) {
        //Write Logic Here
        return a/b;
    }
}


public class Tester1
{
    public static void main(String[] args)
    {
    	

        //Create Object And Execute Method
        SimpleExceptionDemo s=new SimpleExceptionDemo();
        
        Scanner sc=new Scanner(System.in);
        
       try(sc){
        	 
    System.out.println("Enter a value : ");
     int a= sc.nextInt();
     System.out.println("Enter b value : ");
     int  b= sc.nextInt();
     
      System.out.println(s.divide(a,b));
      
    }
    catch(Exception e)
    {
      e.getMessage();
      e.printStackTrace();
      System.out.println("Enter digit only");
      e.toString();
    }
        
    }
}