package com.sumith.lab_work_sep20;
import java.util.Scanner;
public class SwappingFirstAndLastLetter
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a String : ");
       String str=sc.next();
       
       System.out.println("Before swap : "+str);
       
       char ch[]=str.toCharArray();
       
       char temp=ch[0];
       ch[0]=ch[ch.length-1];
       ch[ch.length-1]=temp;
       
       str="";
       
       for(char x:ch)
       {
           str+=x;
       }
       
       System.out.println("After swap : "+str);
       sc.close();
    }
}