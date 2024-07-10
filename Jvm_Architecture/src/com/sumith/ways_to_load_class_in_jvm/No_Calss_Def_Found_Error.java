package com.sumith.ways_to_load_class_in_jvm;

class Message
{
	public void greet()
	{
		System.out.println("Hello EveryOne I Hope You are Fine");
	}
}

public  class No_Calss_Def_Found_Error {

	public static void main(String[] args) {
		
		Message m=new Message();
		m.greet();

	}

}
