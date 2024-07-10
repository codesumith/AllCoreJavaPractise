package com.sumith.lab_work_sep8;
//Import File Here
import java.util.Scanner;

import java.io.IOException;

@SuppressWarnings("serial")
class MyException extends Exception {
   //Define Instance Variables 
   // private String name;

    public MyException() {
    //Write Logic Here
    }
    
    public MyException(String msg){
        super(msg);
    }
    
  
//Define Getters And Setters Method
//Override to String
public String toString(){
  return "MyException  : Name isn't matching";
}
 
}
class UserExceptionDemo  {
   // Take Method Support Create Method base one Your Own View
   
   public void ioException() throws  IOException{
	   throw new IOException();
   }
      
    
}

public class Tester4
{
    public static void main(String[] args) throws IOException,MyException
    {
       String tempName;
       Scanner sc= new Scanner(System.in);
       try(sc){
          String name="nacre";
       
           System.out.print("Enter name : ");
           tempName=sc.next();
           
           if(tempName.equals(name))
           {
               System.out.println("Welcome to NACRE");
           }
           else
           throw new MyException("Hi.."+tempName);
           
           
           
           UserExceptionDemo u=new UserExceptionDemo();
           u.ioException();
           
       }
      
       catch(MyException e)
       {
          System.out.println("Name is not matched");
          System.out.println(e.getMessage());
            System.out.println(e); 
       }
       catch(IOException e)
       {
             System.out.println("IOException");
             
             
       }
     
    }
    
}
