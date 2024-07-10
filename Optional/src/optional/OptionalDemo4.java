package optional;

import java.util.Optional;

public class OptionalDemo4 {
public static void main(String...args) {
	
	Optional<String> initialOptional =Optional.of("India");
	System.out.println(initialOptional.hashCode());
	
	Optional<String> modifiedOptional=modifyOptional(initialOptional);
	System.out.println(modifiedOptional.hashCode());
	
	System.out.println("Address is :"+(initialOptional == modifiedOptional));
}

public static Optional<String> modifyOptional(Optional<String> optional)
{
	if(optional.isPresent())
	{
		return Optional.of("Modified :"+optional.get());
	}
	else
	{
		return Optional.empty();
	}
}
}
