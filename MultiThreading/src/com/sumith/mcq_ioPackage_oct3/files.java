package com.sumith.mcq_ioPackage_oct3;
import java.io.*;
class files
{
public static void main(String args[])
{
File obj = new File("/java/system");
System.out.print(obj.getParent());
System.out.print(" "  + obj.isFile());
}
}