package com.sumith.labworkoct19;


import java.util.LinkedHashMap;
import java.util.Map;

public class MapCharacterOccurence {

	public static Map<Character, Integer> getOccurences(String str) {
		
		Map<Character, Integer> m1 = new LinkedHashMap<>();

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			int z = 1;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j] && ch[j] != '*') {

					z++;
					ch[j] = '*';
				}
			}

			if (ch[i] != '*') {

				m1.put(ch[i], z);
			}
		}
		return m1;

	}

	public static void main(String[] args) {

		Map<Character, Integer> m = MapCharacterOccurence.getOccurences("Hello_World");

		System.out.println(m);

		Map<Character, Integer> m1 = MapCharacterOccurence.getOccurences("TalentSprint");

		System.out.println(m1);
		
		Map<Character, Integer> m2 = MapCharacterOccurence.getOccurences("");

		System.out.println(m2);

	}

}
