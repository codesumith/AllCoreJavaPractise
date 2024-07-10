package com.sumith.labworkMcqOct12;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class Demo9 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
List list = new ArrayList();
Collections.addAll(list, "C", "C++", "C#", "JAVA");
System.out.println(list);

String[] strs = {".Net", "UNIX"};
Collections.addAll(list, strs);
System.out.println(list);

Collections.addAll(list, list);
System.out.println(list);
}

}



