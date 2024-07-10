package com.sumith.labwork_sep22;
import java.util.Scanner;
public class MyProgram1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.next();
        
         System.out.print("Enter a character to remove from string : ");
         char ch1=sc.next().charAt(0);
        
        
        char []ch=str.toCharArray(); 
        
        StringBuilder sb=new StringBuilder("");
        
         System.out.println("String before removing all accourence of given "+ch1+" character."+str);
        
        str="";
        
         
        
        for(char x: ch)
        {
            if(x!=ch1)
            {
                sb.append(x);
            }
        }
        
      str+=sb;
        
          System.out.println("String after removing all accourence of given "+ch1+" character."+str);
          sc.close();
}

}