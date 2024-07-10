package com.sumith.lab_work_sep20;
import java.util.Scanner;
public class CountConsonantsAndVowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.next().toLowerCase();
        
        int vowels=0,consonants=0;
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }
        
        System.out.println("No of Vowels : "+vowels);
         System.out.println("No of Consonants : "+consonants);
         
         sc.close();
    }
}