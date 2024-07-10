package com.sumith.lab_work_sep20;
import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.next().toLowerCase();
    
    boolean palindrome=true;
    
    for(int i=0;i<str.length()/2;i++)
    {
        
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                palindrome=false;
                break;
            }
        
    }
    
    if(palindrome)
    {
         System.out.println(str+" is Palindrome.");
    }
    else
    {
         System.out.println(str+" is not a Palindrome.");
    }
    sc.close();
    }
}