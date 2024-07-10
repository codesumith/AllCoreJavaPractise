package com.sumith.labwork_Programs_oct18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalFinder {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		List<String> l= new ArrayList<String>();
		l.add("Cardiac");
		l.add("ENT");
		l.add("Pediatric");
		l.add("Gastro");
		
		Hospital h1 =new Hospital( "YASHODA",l , "MATHEWS", "9848222222", "Sec");
		Hospital h2 =new Hospital( "Apollo",l , "JOHN", "9848226224", "Mumbai");
		Hospital h3 =new Hospital( "KIMS",l , "Gopal", "8848226223", "Gujarath");
		Hospital h4 =new Hospital( "GHANDHI",l , "Krishna", "9848626254", "Hyderabd");


HospitalService hs=new HospitalService();
hs.addHospital(h1);
hs.addHospital(h2);
hs.addHospital(h3);
hs.addHospital(h4);

System.out.println(hs.getHospitals());

System.out.println("Enter Hospital Code :");
int cd=s.nextInt();

System.out.println(hs.getHospitalDetails(cd));

s.close();
	}

}
