package com.sumith.sep6th_labwork;

public class HandleNullPointerException {
	
	public void display(Object e) {
		System.out.println(e);
	}

	public static void main(String[] args) {
		HandleNullPointerException h=null;
		
		if(h==null) {
			h=new HandleNullPointerException();
			h.display(h);
		}
//		else 
//		{
//			h.display(h);
//		}

	}

}
