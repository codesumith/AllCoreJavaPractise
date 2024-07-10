package com.sumith.phone_simcard_intercation;

public class Test {

	public static void main(String[] args) {
		
Jio j=new Jio("9885040345");
j.activation();
j.getPhoneNumber();

System.out.println("-------------------------------------------------");

MobilePhone m=new MobilePhone(j.networkProvider());
m.inserting();
m.makingCall("Suresh");
m.sendingMessage("Anil");
m.removing();

System.out.println("-------------------------------------------------");


Bsnl b=new Bsnl("9885040346");
b.activation();
b.getPhoneNumber();

System.out.println("-------------------------------------------------");

MobilePhone m1=new MobilePhone(b.networkProvider());
m1.inserting();
m1.makingCall("Suresh");
m1.sendingMessage("Anil");
m1.removing();

System.out.println("-------------------------------------------------");


Airtel a=new Airtel("9885040343");
a.activation();
a.getPhoneNumber();

System.out.println("-------------------------------------------------");

MobilePhone m2=new MobilePhone(a.networkProvider());
m2.inserting();
m2.makingCall("Suresh");
m2.sendingMessage("Anil");
m2.removing();



	}

}
