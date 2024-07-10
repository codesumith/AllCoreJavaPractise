package com.sumith.try_with_resource;

public class DatabaseResource implements AutoCloseable {

	@Override
	public void close() throws Exception {

		System.out.println("Data base resource closed");

	}

}
