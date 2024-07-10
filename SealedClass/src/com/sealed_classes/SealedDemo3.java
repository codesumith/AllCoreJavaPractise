package com.sealed_classes;


sealed interface Drawable permits Draw
{
	void m1();
}

final class Draw implements Drawable
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class SealedDemo3 {

	public static void main(String[] args) {
		

	}

}
