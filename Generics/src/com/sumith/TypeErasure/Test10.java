package com.sumith.TypeErasure;

public class Test10 {
public static void main(String[] args) {
	Object [] obj =new String[3];
	obj[0]="Ravi";
	obj[1]="hyd";
	obj[2]=12; //java.lang.ArrayStoreException
}
}
//note : It will generate java.lang.ArrayStoreException because we are trying to insert 12
//(Integer value) in String array.