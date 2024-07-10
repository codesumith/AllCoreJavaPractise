package com.sumith.exam_mcqaug26;
class Out
    {
        static int x;
 	    static int y;
        void add(int a , int b)
        {
            x = a + b;
            y = x + b;
        }
    }    
    class Ex22
    {
        public static void main(String args[])
        {
          Out obj1 = new Out();
          Out obj2 = new Out();   
            int a = 2;
            obj1.add(a, a + 1);
            obj2.add(5, a);
            //System.out.println(obj1.x + " " + obj2.y);     
        }
   }