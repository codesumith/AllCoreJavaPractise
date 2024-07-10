package com.sumith.wildcardcharacter;

class MyClass<T>
{
	T obj;
	public MyClass(T obj)
	{
		this.obj=obj;
	}
	
	T getObj()
	{
		return obj;
	}
}

public class Test15 {

	public static void main(String[] args) {
		
		Integer i=12;
		MyClass<Integer>mi =new MyClass<Integer>(i);
		System.out.println("Integer object stored :"+mi.getObj());
		
		Float f=12.34f;
		MyClass<Float> mf=new MyClass<Float>(f);
		System.out.println("Float object stored :"+mf.getObj());
		
		MyClass<String> ms =new MyClass<String>("Rahul");
		System.out.println("String object stored :"+ms.getObj());
		
		MyClass<Boolean> mb=new MyClass<Boolean>(false);
		System.out.println("Boolean object stored :"+mb.getObj());
		
		Double d=99.34;
		MyClass<Double> md=new MyClass<Double>(d);
		System.out.println("Double object stored :"+md.getObj());

	}

}
