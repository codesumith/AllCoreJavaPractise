package com.sumith.mcq_ioPackage_oct3;

import java.io.File;

public class FilesAndIO14 {
	public static void main(String[] args) {
		File file = new File("\\");
		System.out.println(file.getParent());
	}
}