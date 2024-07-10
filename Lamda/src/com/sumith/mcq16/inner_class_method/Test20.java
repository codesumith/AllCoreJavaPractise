package com.sumith.mcq16.inner_class_method;

class First 
{
public Object method1()
{
System.out.println("super method1");
return new String("Base");
}
}

class Second extends First 
{
public String method1() 
{
System.out.println("Subclass method1");
return new String("Derived");
}
}

class Test20
{
public static void main(String[] args)
{
//First f = new Second();
//String s = f.method1();
}

}
