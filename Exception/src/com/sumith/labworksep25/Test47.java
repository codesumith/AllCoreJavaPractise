package com.sumith.labworksep25;
public class Test47
{
public static void main(String [] args)
{
String test="no";
try
{
System.out.println("Start try");//1
doRisky(test);
System.out.println("End try");//4
}
catch (Exception e)
{
System.out.println("Exception Handled");
}
finally
{
System.out.println("Finally");//5
}
System.out.println("End of main");//6
}
static void doRisky(String test) throws Exception
{
System.out.println("Start risky");//2
if("yes".equals(test))
{
throw new Exception();
}
System.out.println("End Risky");//3
return;
}
}