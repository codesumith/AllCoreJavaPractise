package com.sumith.Student;
class Student {
    //4 instance variable
    
    private int studentid;
    private String studentName;
    private int marks;
    private char grade;
    
    public void setStudentData(int sid,String sname,int smarks) {
     //write logic to set value to the instance variable
     this.studentid=sid;
     this.studentName=sname;
     this.marks=smarks;
     
     
     
    }
     public String displayDetails() {
         
           return "Student [name="+studentName+",student id="+studentid+",marks="+marks+",grade="+grade+"]";
     }
    public void calculateGrade() {
        
        if(marks>90){
           grade='A';
           
        }
        else if(marks<=90&&marks>=81) {
        	grade='B';
        }
        else if(marks<=80&&marks>=71) {
        	grade='C';
        }
        else if(marks<=70&&marks>=61) {
        	grade='D';
        }
        else  {
        	grade='E';
        }
    }
}

public class MyProgram
{
    public static void main(String[] args)
    {
        //Test the above code here
    	Student s= new Student();
    	s.setStudentData(123, "kiran", 80);
    	s.calculateGrade();
    	System.out.println(s.displayDetails());
    	
    }
}
