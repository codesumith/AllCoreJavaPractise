package com.sumith.school;

public class Main {

	public static void main(String[] args) {
		
		Teacher tec= new Teacher("Ravindra", "java");
		Student std= new Student("sumith", 12, 7.5,tec );
		Principal pri=new Principal("venkat", 5);
	    School s= new School("sai","hyd",std,pri);
	    System.out.println(s);
	    School s1= new School(s);
	    System.out.println(s1);
	    Teacher tec1= new Teacher("Ravi", "CoreJava");
	    Student std1= new Student("Anil", 14, 6.5,tec );
	    s.addStudent(std1);
	    std1.changeTecher(tec1);
	    System.out.println(s);
	    
	    
		

	}

}
