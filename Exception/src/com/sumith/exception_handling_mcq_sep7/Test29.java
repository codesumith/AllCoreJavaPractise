package com.sumith.exception_handling_mcq_sep7;
public class Test29
{
public static void main(String[] args) {
int i;

    try {
         i=calculate();
         System.out.println(i);
         
    }
    catch(Exception e) {
         System.out.println("Error occured");
    }
}
private static int calculate() {
    return (7/2);
}
}