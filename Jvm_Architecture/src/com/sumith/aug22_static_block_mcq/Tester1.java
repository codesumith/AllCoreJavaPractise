package com.sumith.aug22_static_block_mcq;

 abstract class Animal
{
 public void sound(){
	 
	 
 }
}

 class Lion extends Animal{
	 
	 public void sound(){
		 System.out.println(" Lion roaaar");
	 }
 }
 
class Tiger extends Animal{
	 
	 public void sound(){
		 System.out.println(" Tiger Grrr");
	 }
 }
public class Tester1 {
	
	public static void main(String[] args)
    {
        
		
		Lion l=new Lion();
		l.sound();
		
		Tiger t=new Tiger();
		t.sound();
    }

}
