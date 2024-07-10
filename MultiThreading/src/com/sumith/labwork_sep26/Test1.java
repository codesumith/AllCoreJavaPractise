package com.sumith.labwork_sep26;

//import java.util.Collections;
//import java.util.Vector;

public class Test1 {
public void validate() {

    int i = 0;
    while (++i < 3) {
    try {
    wait();
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    System.out.print(i);
    }
    }
    public static void main(String[] args) {
    new Test1().validate();
    }
}



