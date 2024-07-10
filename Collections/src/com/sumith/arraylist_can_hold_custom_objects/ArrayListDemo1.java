package com.sumith.arraylist_can_hold_custom_objects;

import java.io.*;
import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) throws IOException {
		
		//ArrayList<EmployeeBLC>
		var ar=new ArrayList<EmployeeBLC>();
		
	//	File f=new File("/Users/sumith/Desktop/JavaIoFiles/employee.txt");
		
		//BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		
		ar.add(new EmployeeBLC(111, "Raj", 1200.89));
		ar.add(new EmployeeBLC(112, "Raju", 1230.89));
		ar.add(new EmployeeBLC(113, "Rajesh", 1240.89));
		ar.add(new EmployeeBLC(114, "Rajitha", 1250.89));
		
		ar.forEach(emp -> System.out.println(emp));
		




	}

}
