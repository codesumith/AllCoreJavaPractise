package com.sumith.wildcardcharacter;

//E stands for Element

class Fruit
{
	
}

class Apple extends Fruit   //Fruit is super ,Apple is sub Class
{
	
}

class Basket<E>     //E type is Fruit
{
	private E element;
	
	public void setElement(E element) //Fruit element =new Apple ();
	{
		this.element=element;
	}

	public E getElement() {
		return element;
	}
	
}

public class Test16 {

	public static void main(String[] args) {
		
		Basket<Fruit> b=new Basket<Fruit>();
		b.setElement(new Apple());
		
		
		Apple x= (Apple) b.getElement();
		System.out.println(x);

	}

}
