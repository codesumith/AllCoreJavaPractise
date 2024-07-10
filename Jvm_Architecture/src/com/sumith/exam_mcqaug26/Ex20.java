package com.sumith.exam_mcqaug26;
class Access
    {
       static int x;
       void increment()
       {
           x++;
       }   
     }   
    public class Ex20
    {
        public static void main(String args[])
        {
            Access obj1 = new Access();
            Access obj2 = new Access();
            //obj1.x = 0;   
            obj1.increment();
            obj2.increment();
            //System.out.println(obj1.x + " " + obj2.x);
         }
   }