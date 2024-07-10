package com.sumith.programing_on_io_oct5;
import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Student implements Serializable
{
   private  String student_Name;
   private int student_id;
   private transient String emailId;
   private String Address ;
   
	public Student(String student_Name, int student_id, String emailId, String address) {
		super();
		this.student_Name = student_Name;
		this.student_id = student_id;
		this.emailId = emailId;
		Address = address;
	}
	
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
    
    @Override
	public String toString() {
		return "Student [student_Name=" + student_Name + ", student_id=" + student_id + ", emailId=" + emailId
				+ ", Address=" + Address + "]";
	}
    
    

	public static  Serializable  storeStudentObjects()
    {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	
    	
    	System.out.print("Enter your name :");
    	String name = sc.next();
    	
    	System.out.print("Enter your id :");
    	int id =sc.nextInt();
    	
    	System.out.print("Enter your emailId :");
    	String email=sc.next();
    	
    	System.out.print("Enter your Address :");
    	String Address=sc.next();
    	
    	
		return new Student(name,id,email,Address);
    	
    }
    
}