package com.sumith.lab_work_sep20;

import java.util.Scanner;

class RemoveAllOccurrence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.next();
        
         System.out.println("Enter a character you want to remove.");
         char ch1=sc.next().charAt(0);
         
         System.out.println("String before removing "+ch1+" is "+str); 
        
        char [] ch=str.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
                if(ch[i]==ch1)
                {
                    ch[i]='*';
                }
            }
        
        str="";
        
        for(char x:ch)
        {
            if(x!='*')
            {
               str+=x; 
            }
        }
       
        System.out.println("String after removing "+ch1+" is "+str); 
        
        sc.close();
    }
}