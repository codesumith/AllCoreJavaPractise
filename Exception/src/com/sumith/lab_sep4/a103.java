package com.sumith.lab_sep4;
public class a103 
{
      static String s = "";
      public static void main(String[] args) 
      {
            try 
            {
                 s += "1";
                 throw new Exception();
            } catch (Exception e) 
            {
                 s += "2";
            } 
            finally 
            { 
                  s += "3";
                  doStuff(); 
                  s += "4";
            }
            System.out.println(s);
       }
       static void doStuff() 
       { 
//            int x = 0; 
//            int y = 7/x; 
       }
}