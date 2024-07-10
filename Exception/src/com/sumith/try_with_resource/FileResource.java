package com.sumith.try_with_resource;

import java.io.Closeable;
import java.io.IOException;

public class FileResource implements Closeable {

	@Override
	public void close() throws IOException {

		System.out.println("File Resouce Closed..!!");

	}

}
