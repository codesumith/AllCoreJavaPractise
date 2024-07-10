package com.sumith.lab_sep4;
public class a87 {
  public static void main(String[] argv) 
  {
    try 
    {
      throw new OutOfMemoryError();
     // System.out.println("Success");
    }
    catch (Exception e) 
    {
      System.out.println("General exception");
    } 
    finally
    {
      System.out.println("Doing finally part");
    }
    System.out.println("Carrying on");

  }
}