package com.sumith.lab_work_sep8;
//Import File Here

class Test{
    
    public void Check(int[] arr)
    {
        //Write Logic Here	
        System.out.println(arr[3]);
    }
}

public class Tester2
{
    public static void main(String[] args)
    {
        //Create Object And Execute Method
        try{
            int [] a=new int[2];
            Test t = new Test();
            t.Check(a);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array is out of limit!!");
        }
    }
}