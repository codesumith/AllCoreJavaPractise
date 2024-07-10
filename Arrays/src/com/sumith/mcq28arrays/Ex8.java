package com.sumith.mcq28arrays;
public class Ex8 {

    static void test(int[] a) {
        int[] b = new int[2];
        a = b;
        System.out.print(b.length);
        System.out.print(a.length);
        }
        public static void main(String[] args) {
        int[] a = new int[5];
        test(a);
        System.out.print(a.length);
        }
}