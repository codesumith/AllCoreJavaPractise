package com.sumith.labwork_sep22;
import java.util.Scanner;
public class MyProgram5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=sc.next();
        
        int sum=0;
        
        for(int i=0;i<str.length();i++)
        {
        	if(Character.isDigit(str.charAt(i)))
           // if(str.charAt(i)>47&&str.charAt(i)<58)
            {
        		System.out.println(str.charAt(i));
                sum+=(str.charAt(i)-48);
            }
        }
        
        System.out.println("SUM IS : "+sum);
        sc.close();
    }
}