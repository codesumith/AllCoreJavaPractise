package com.sumith.lab_work_sep8;
class ClassNotFoundExpDemo {
 @SuppressWarnings("rawtypes")
//Define Instance variable
 Class c;
 
 

    public ClassNotFoundExpDemo() {
       //Write Logic Here
       try{
     c=Class.forName("TestClass");
 }
 catch(ClassNotFoundException e)
 {
     System.out.println("Class Not Found");
     e.printStackTrace();
     e.getMessage();
 }
    }
}
public class Tester3
{
    public static void main(String[] args)
    {
        //Create Object And Execute Method
       // ClassNotFoundExpDemo d =new  ClassNotFoundExpDemo();
    }
}