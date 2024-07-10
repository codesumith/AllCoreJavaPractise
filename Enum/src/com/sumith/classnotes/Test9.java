package com.sumith.classnotes;

public enum Test9 {
	
	TEST1,TEST2,TEST3;
	
	int y=100;
	
   public static void main(String []args) {
	   
	   int x=100;
		
	   System.out.println("Enum main method"+x);
	}
   
  // TEST1,TEST2,TEST3; //error coonstants must declare at first line of enum class only.

   Test9(){
	   System.out.println("Constructor executed");
   }
}
