package com.sumith.io_package_Mcq_Oct2;
import java.io.*;
public class filesinputoutput8
{
    public static void main(String[] args)
    {
   String obj  = "abc";
       byte b[] = obj.getBytes();
       ByteArrayInputStream obj1 = new ByteArrayInputStream(b);
       ByteArrayOutputStream obj2 = new ByteArrayOutputStream();
       for (int i = 0; i < 2; ++ i)
       {
           int c;
           while((c = obj1.read()) != -1)
           {
               
                   System.out.print(Character.toUpperCase((char)c));
                    obj2.write(b[i]); 
           }
           //break;
           System.out.print(obj2);
       }
    }
}