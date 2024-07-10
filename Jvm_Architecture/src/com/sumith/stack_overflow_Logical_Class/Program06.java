package com.sumith.stack_overflow_Logical_Class;
class Program06 {
    int a=10;//2
    
    {//if you make this block as static this it will execute in flow
    	
         System.out.println("1st non static block");//3
         Program06 p1=new Program06();
         System.out.println(p1.a);
         System.out.println(p1.b);
         System.out.println(p1.c);
     
    }
    
    int b=20;
    
    Program06(){
         System.out.println("constructor executed");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");//1
        Program06 p1=new Program06();
        System.out.println(p1.a);
        System.out.println(p1.b);
        System.out.println(p1.c);
        p1.m1();
    }
    
    public void m1(){
         System.out.println("method executed");
   
    }
    
    {
         System.out.println("2nd non static block executed");
    } 
    int c=30;
}