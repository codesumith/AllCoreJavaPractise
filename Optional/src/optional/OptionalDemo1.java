package optional;
import java.util.*;

public class OptionalDemo1 {
public static void main(String[] args) {
	String str =null;
	
	Optional<String> optional =Optional.ofNullable(str);
	String orElse =optional.orElse("No value in container");
	System.out.println("Value by orElse :"+orElse);
	
	
	//Optional is containing value or not
	if(optional.isPresent())
	{
		System.out.println("Value by get :"+optional.get());
	}
	else
	{
		System.out.println("No value is available");
	}
}
}
