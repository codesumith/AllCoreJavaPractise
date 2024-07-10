package com.sumith.labworksep25;
class ExceptionPropogation
{
public static void main(String[] args)
{
System.out.println("Main method started");
m1();
System.out.println("Main method ended");
}
public static void m1()
{
try
{
m2();
}
catch (Exception e)
{
System.out.println("Handled in m1");
}
}
public static void m2()
{
m3();
}
public static void m3()
{
System.out.println(10/0);
}
}