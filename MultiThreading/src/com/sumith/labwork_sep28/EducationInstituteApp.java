package com.sumith.labwork_sep28;



//Course class representing a course offered by the education institute
class Course {
int id ;
String name ;
double fee;

public Course (int id , String name , double fee )
{
    this .id =id;
    this .name =name;
    this .fee= fee;
}

public int getId()
{
    return id;
}

public String getName()
{
    return name;
}

public double getFee()
{
    return fee;
}

@Override
public String toString() {
	
	return  id +". "  + name + " - Fee:Rs." + fee;             
	
}



}

//Offer class representing a special offer provided by the education institute
class Offer {
    
	//declare attributes and develop constructor and getter method
 
 String offerText;
    
  public Offer(String offerText)
  {
      this.offerText=offerText;
  }
	
	public String getOfferText()
	{
	    return offerText;
	}

	@Override
	public String toString() {
		return  offerText  ;
	}
	
	

}



//EducationInstitute class managing courses, offers, and student enrollment
class EducationInstitute {
    Course [] courses ;
    Offer  [] offers;
    
    public EducationInstitute(Course [] courses, Offer [] offers )
    {
        this.courses=courses;
        this.offers=offers;
    }
    
    public Course[] getCourses()
    {
        return courses;
    }
    
    public Offer[] getOffers()
    {
        return offers;
    }
    
    public void enrollStudentInCourse(int courseId , String studentName)
    {
    	String course="";
if (courseId == 1) course +="Mathematics";  
else if (courseId == 2) course +="Science";  
else course +="English";  

        System.out.println(studentName+" has enrolled in the course "+course);
    }
}

//Student class representing a student who interacts with the education institute
class Student {
    
    String name;
    EducationInstitute institute;
    
    public Student(String name , EducationInstitute institute)
    {
        this .name=name;
        this.institute =institute;
        
    }
    
    public void viewCoursesAndFees()
    {
    	for(Course c:institute.courses) {
        System.out.println(c);}
    	
    	System.out.println();
    }
    
    public void viewOffers()
    
    {
    	for(Offer o:institute.offers) {
         System.out.println(o);}
    	
    	System.out.println();
    }


public void enrollCourse(int courseId)
{
    institute.enrollStudentInCourse(courseId, name);
}
}

//EducationInstituteApp class as the main program
public class EducationInstituteApp {
	public static void main(String[] args) throws InterruptedException  {
	  //Test your code here....
		Course c1=new Course(1,"Mathematics",1000);
		Course c2=new Course(2,"Science",1200);
		Course c3=new Course(3,"English",900);
		
		Offer o=new Offer("Special discount: Get 20% off on all courses!");
		Offer o1=new Offer("Limited time offer: Enroll in any two courses and get one course free!");
		
		Course [] availableCourses= {c1,c2,c3};
		Offer []  availableOffers = {o,o1};
		
	  EducationInstitute ei=new EducationInstitute(availableCourses,availableOffers);
	  
	  Student s1=new Student("John",ei);
	  
	  Thread student1=new Thread()
			  {
		  public void run()
		  {
	  s1.viewCoursesAndFees();
	  s1.viewOffers();
	  s1.enrollCourse(1);
	  
		  }
			  };
			  
			  student1.start();
			  student1.join();
			  
	  
	  System.out.println(".......................................................");
	  
	  Student s2=new Student("Alice",ei);
	  Thread student2=new Thread()
	  {
  public void run()
  {
s2.viewCoursesAndFees();
s2.viewOffers();
s2.enrollCourse(2);

  }
	  };
	  
	  student2.start();

	}
}