package com.sumith.lab_work_sep13;

public class Demo1 {
public static void main(String[] args) {
String s1 = new String("na1re2sh3it");
String[] t = s1.split("\\d");
for (String s:t)
{
System.out.print(s);
}
}
}