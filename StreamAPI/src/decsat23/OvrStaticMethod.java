package decsat23;

class Parent{
	public  void display() {
		System.out.println("Parent");
		
	}
	
	public static int display(String s) {
		
		return s.length();
	}
}

class Child extends Parent{
	public  void display() {
		System.out.println("Child");
	}
}

public class OvrStaticMethod {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Parent p =new Child();
		p.display();
		System.out.println(p.display("Hello"));
		
	}

}
