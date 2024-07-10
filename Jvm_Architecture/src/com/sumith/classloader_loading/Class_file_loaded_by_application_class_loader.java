package com.sumith.classloader_loading;



public class Class_file_loaded_by_application_class_loader {

	public static void main(String[] args) {
		
		
		System.out.println("This ClassLoaderDemo class is loaded by : "+Class_file_loaded_by_application_class_loader.class.getClassLoader().getParent());
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Parent or super class for Application class loader is : "+Class_file_loaded_by_application_class_loader.class.getClassLoader().getParent());
	}

}
