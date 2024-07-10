package com.sumith.oct6th_io_exception;

import java.io.*;


class ReadWrite
{
	 RandomAccessFile file;
	
	public ReadWrite()
	{

	}
	public void write(String filePath,String data,int position) throws IOException
	{
		file=new RandomAccessFile(filePath,"rw");
		
		file.seek(position);
		
		file.write(data.getBytes());
	}
	
	public byte[] read(String filePath,int position,int length) throws IOException

	{
		
		
		file.seek(position);
		
		byte[]data=new byte[length];
		
		file.read(data);
		
		return data;
		
	}
	
	
}

public class Test {
	
	static final String path="/Users/sumith/Desktop/JavaIoFiles/filePath.txt";
	
	static String str="Welcome to hyderabad Metro";

	public static void main(String[] args) {
		
		ReadWrite rw=new ReadWrite();
		
		try
		{
			
			rw.write(path, str, 22);
			byte b[]=rw.read(path, 22, 25);
            System.out.println(new String(b));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		

	}

}
