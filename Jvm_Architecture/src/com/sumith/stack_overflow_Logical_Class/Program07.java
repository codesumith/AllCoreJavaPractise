package com.sumith.stack_overflow_Logical_Class;
class Program07 {
    int a=10;//2//13
    
    {
         System.out.println("1st non-static block");//3//14

    }
    
    int b=20;//4//15
    
    Program07(){
         System.out.println("constructor executed");//7//18
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");//1
        Program07 p1=new Program07();
        System.out.println(p1.a);//8
        System.out.println(p1.b);//9
        System.out.println(p1.c);//10
        p1.m1();//11
    }
    
    public void m1(){
         System.out.println("method executed");//12
         Program07 p1=new Program07();
         System.out.println(p1.a);//19
         System.out.println(p1.b);//20
         System.out.println(p1.c);//21
    }
    
    {
         System.out.println("2nd non static block executed");//5//16
    } 
    int c=30;//6//17
}