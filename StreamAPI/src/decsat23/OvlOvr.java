package decsat23;

class SuperClass {
public static void display() {
        System.out.println("SuperClass.display()");
        }

//Method overloading of static method
public static void display(int a) {
        System.out.println("SuperClass.display(int): " + a);
        }
        }

class SubClass extends SuperClass {
    //Not method overriding but hiding
	
    public static void display() {
        System.out.println("SubClass.display()");
    }
}
public class OvlOvr {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		SuperClass object =new SubClass();
		object.display();
		object.display(1);
	}
	
	
}
