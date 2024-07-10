package com.sumith.lab_sep4;

import java.io.FileNotFoundException;

public class a60
{
       public static void main(String[] argv) throws Exception 
       {
             try 
             {
                    throw new FileNotFoundException("");
             } 
			 catch (FileNotFoundException ex) 
               {
                    System.out.println("book list not found!");
                    throw ex;
               }
       }
}
