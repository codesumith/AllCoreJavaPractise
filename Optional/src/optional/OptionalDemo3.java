package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo3 {
public static void main(String[] args) {
	List<Optional<String>> optionalList =new ArrayList();
	
	optionalList.add(Optional.of("Ameerpet"));
	optionalList.add(Optional.of("S.R Nagar"));
	optionalList.add(Optional.of("Begumpet"));
	optionalList.add(Optional.of("Koti"));
	optionalList.add(Optional.empty());
	
	for(Optional<String>optional: optionalList)
	{
		if(optional.isPresent())
		System.out.println(optional.get());
		else 
			System.out.println("No data is available");
		
	}
	
}
}
