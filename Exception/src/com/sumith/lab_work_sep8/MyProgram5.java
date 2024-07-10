package com.sumith.lab_work_sep8;
import java.lang.Math;

class Volume{
    double PI=Math.PI;
    
     public int getVolumeOfCube(int a)
     {
         if(a<=0){
             
             throw new NumberFormatException("All values must be positive");
             
         }
         else if(a>=100){
               throw new NumberFormatException("Out of range");
         }
         else{
        
         return a*a*a;
         }
         
     }
     
      public int getVolumeOfCuboid(int a,int b,int c)
     {
         if(a<=0||b<=0||c<=0){
             throw new NumberFormatException("All values must be positive");
         }
          else if(a>=100||b>=100||c>=100){
             throw new NumberFormatException("Out of range");
         }
         else{
         
         return a*b*c;
         }
     }
     
      public double getVolumeOfHemisphere(double a)
     {
        if(a<=0){
             
             throw new NumberFormatException("All values must be positive");
             
         }
         else if(a>=100){
               throw new NumberFormatException("Out of range");
         }
         else{
         return (2*PI)*a*a*a;
         }
     }
     
      public double getVolumeOfCylinder(double a,double b)
     {
        
         if(a<=0||b<=0){
             throw new NumberFormatException("All values must be positive");
         }
          else if(a>=100||b>=100){
             throw new NumberFormatException("Out of range");
         }
         else
         return (PI)*a*a*b;
     }
}

public class MyProgram5
{
    public static void main(String[] args)
    {
        //Write Code Here
        
        //Create Object and call Methods
        try{
            Volume v =new Volume();
            
    System.out.println("Volume of cube is : "+v.getVolumeOfCube(10));
       System.out.println("Volume of cuboid is : "+v. getVolumeOfCuboid(10,10,14));
             System.out.println("Volume of hemisphere is : "+v.getVolumeOfHemisphere(100));
             System.out.println("Volume of cylinder is : "+v.  getVolumeOfCylinder(10,14));
        }
        catch(Exception e )
        {
            System.out.println(e.getMessage());
        }
    }
}