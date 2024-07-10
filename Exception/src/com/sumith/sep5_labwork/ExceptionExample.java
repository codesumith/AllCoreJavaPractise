package com.sumith.sep5_labwork;
public class ExceptionExample {
    public static void main(String[] args) throws Exception {
        int num = 10;
        if (num > 5) {
            throw new Exception("Invalid number.");
        }
        System.out.println("End of program.");
    }
}