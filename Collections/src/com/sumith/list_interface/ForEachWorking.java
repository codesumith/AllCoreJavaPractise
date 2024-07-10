package com.sumith.list_interface;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachWorking {

	public static void main(String[] args) {
		
		Vector <String> fruits =new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Guava");
		
		//Anonymous inner class
		Consumer <String> cons =new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						System.out.println(t);
						
					}
			
				};
				fruits.remove(1);
				fruits.forEach(cons);
				

	}

}
