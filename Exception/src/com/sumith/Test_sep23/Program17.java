package com.sumith.Test_sep23;
//import java.io.FileNotFoundException;
import java.io.IOException;

class Dem01{
void m1()throws IOException {
System.out.println("Dem0 class method");
}
}
class Sample1 extends Dem01{

public void m1() throws NullPointerException{
	//throw new NullPointerException();
    System.out.println("Sample class method");
    
}
}
public class Program17 {
public static void main(String[] args) {
//Dem01 d1=new Sample1();

//        try {
//           // d1.m1();
//        } catch (FileNotFoundException e) {
//
//            e.printStackTrace();
//        } 

}
}