package com.sumith.overrriding_abstract_class_methods_in_inner_Class;

public class Anonymus_Inner_With_AbstractClass {

	public static void main(String[] args) {
		

		Shape rect=new Shape()
				{

					@Override
					public void draw() {
						
						System.out.println("Drawing rectangle");
						
					}
			
				};
				
				Shape square=new Shape() {

					@Override
					public void draw() {
						
						System.out.println("Drawing square");	
					}
					
				};
				
				Shape circle=new Shape()
						{

							@Override
							public void draw() {
								System.out.println("Drawing circle");
								
							}
					
						};
						
						rect.draw();square.draw();circle.draw();

	}

}
