package decsat23;

class Hello{
    public static void hello(){
        System.out.println("Hello");
    }

	
}

class welcome extends Hello{


    public static void hello(){
     
        System.out.println("Welcome");
    }
}

public class ThisSuper {

    @SuppressWarnings("static-access")
	public static void main(String[] args) {

       welcome w =(welcome)new Hello();
       w.hello();
      
       

    }
}

