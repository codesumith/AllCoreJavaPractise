package com.sumith.exception_handling_mcq_sep7;
import java.util.Scanner;
public class MyProgram
{
    public void  checkNo(int no){
        //write the logic here
        if(no%2==0)
        {
            System.out.println("Given number is even");
        }
        else
        System.out.println("Given number is odd");
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int v;
        do{
            System.out.print("Enter the number : ");
             v=sc.nextInt();
             if(v==0){
                 System.out.println("Digit should not be zero");
             }
             if(v<0)
             {
                 System.out.println("Digit should not be negetive");
             }
        }
        while(v<1);
        
        MyProgram m=new MyProgram();
        m.checkNo(v);
        
        sc.close();
    }
}