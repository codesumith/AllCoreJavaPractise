package com.sumith.labwork_sep22;
import java.util.Scanner;
public class MyProgram2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        
        char [] ch=str.toCharArray();
        
       
        
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            for(int j=i+1;j<ch.length;j++){
            
            if(ch[i]==ch[j]&&ch[j]!='*')
            {
                count++;
                ch[j]='*';
            }
        }
       
        if(ch[i]!='*' && ch[i]!=' ')     System.out.println("Occurence of character "+ch[i]+" is "+count+" times.");
        
    }
        
        sc.close();
}

}