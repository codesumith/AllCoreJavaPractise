package optional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo5 {
public static void main(String[] args) {
	Map<String, String> map =new HashMap<>();
	map.put("key1", "value1");
	map.put("key2", "value2");
	map.put("key3", "value3");
	
	String keyToFind ="key1";
	Optional<String> optionalValue = Optional.ofNullable(map.get(keyToFind));
	
	//key is existing or not
	if(optionalValue.isPresent())
	{
		System.out.println("Value for key '"+ keyToFind +"' : "+optionalValue.get());
	}
	else
	{
		System.out.println(" Key '"+keyToFind+"' not found in the map.");
	}
	
	String nonExistenseKey="key5";
	Optional<String> optionalNonExistentValue= Optional.ofNullable(map.get(nonExistenseKey));
	String orElse=optionalNonExistentValue.orElse("Value is not availale for "+nonExistenseKey);
	
	System.out.println("value for key '" +nonExistenseKey +"': "+orElse);
	
	
	LocalDate d =LocalDate.now();
	System.out.println(d);
	
	LocalTime t =LocalTime.now();
	System.out.println(t );
	
	System.out.println(LocalDateTime.now());
}
}
