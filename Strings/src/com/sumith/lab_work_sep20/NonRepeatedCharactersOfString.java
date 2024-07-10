package com.sumith.lab_work_sep20;
import java.util.Scanner;
public class NonRepeatedCharactersOfString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.next();
        
         int count;
        
        for(int i=0;i<str.length();i++)
        {
          count=0;
            
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))    count++;
                
            }
            
            if(count==1)  System.out.println(str.charAt(i));  
           
            sc.close();
        }
    }
}