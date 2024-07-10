package com.sumith.labwork_sep25;
public class Test16 extends Thread
{
static String name = "ravi";

public static void main(String args[])
{
Test16 t = new Test16();
t.Test(name);
System.out.print(" " + name);
}

public void Test(String name) {
start();
System.out.print(" method");
}

public void run() {
System.out.print(" run");
}
}