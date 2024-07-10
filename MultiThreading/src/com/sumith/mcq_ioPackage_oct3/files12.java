package com.sumith.mcq_ioPackage_oct3;
import java.io.*;
public class files12
{
public static void main(String args[])
{
File obj = new File("/java/system");
System.out.print(obj.canWrite());
System.out.print(" " + obj.canRead());
}
}



