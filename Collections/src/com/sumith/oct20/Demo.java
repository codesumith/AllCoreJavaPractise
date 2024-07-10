package com.sumith.oct20;

import java.util.Map;
import java.util.TreeMap;

public class Demo
{
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args)
{
Map sampleMap = new TreeMap();
sampleMap.put(1, null);
sampleMap.put(5, null);
sampleMap.put(3, null);
sampleMap.put(2, null);
sampleMap.put(4, null);

   System.out.println(sampleMap);
}
}