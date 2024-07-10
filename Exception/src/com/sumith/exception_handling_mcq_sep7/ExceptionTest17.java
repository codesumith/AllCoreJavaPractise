package com.sumith.exception_handling_mcq_sep7;
public class ExceptionTest17
{
static void show()
{
try
{
System.out.println("inside TRY");
return;
}
finally
{
System.out.println("inside FINALLY");
}
}
public static void main(String[] args)
{
show();
}
}