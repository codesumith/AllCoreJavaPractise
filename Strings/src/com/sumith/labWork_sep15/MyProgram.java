package com.sumith.labWork_sep15;



//import java.util.Arrays;

public class MyProgram
{
    public static void main(String[] args)
   
    {
        //Write Code Here
        String s="aabbAa";
        char [] ch=s.toCharArray();
//       Arrays.sort(ch);
//                                   with predifined methods;
//       System.out.println(ch);
      
       char temp;
        
        for(int i=0;i<s.length()-1;i++)
        {
         
            for(int j=i+1;j<s.length();j++)
            {
             
                if(ch[i]>ch[j]){
                  temp =ch[i];
                   ch[i]=ch[j];
                   ch[j]=temp;
                }

            }
       
       }
       System.out.println(ch);
    }
}