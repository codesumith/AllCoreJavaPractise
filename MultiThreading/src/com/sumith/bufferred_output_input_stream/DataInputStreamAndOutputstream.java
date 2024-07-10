package com.sumith.bufferred_output_input_stream;

import java.io.*;

public class DataInputStreamAndOutputstream {

	public static void main(String[] args) throws IOException {
		
		var fout =new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/Primitive.txt");
		var dout =new DataOutputStream(fout);
		
		try(fout;dout)
		{
			dout.writeBoolean(true);
			dout.writeChar('A');
			dout.writeByte(Byte.MAX_VALUE);
		    dout.writeShort(Short.MAX_VALUE);
		    dout.writeInt(Integer.MAX_VALUE);
		    dout.writeLong(Long.MAX_VALUE);
		    dout.writeFloat(Float.MAX_VALUE);
		    dout.writeDouble(Math.PI);
		    dout.writeBytes("Hello India");
		    dout.flush();//for reuse purpose
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}
		
		System.out.println("Reading the primitive data from the files!!!");
		
		var fin =new FileInputStream("/Users/sumith/Desktop/JavaIoFiles/Primitive.txt");
		
		var din =new DataInputStream(fin);
		
		try(fin;din)
		{
			boolean b=din.readBoolean();
			char c=din.readChar();
			byte by=din.readByte();
			short s=din.readShort();
			int i=din.read();
			long l=din.readLong();
			float f=din.readFloat();
			double d=din.readDouble();
			@SuppressWarnings("deprecation")
			String str=din.readLine(); //for reading string deprecated;
			
			System.out.println(b+"\n"+c+"\n"+by+"\n"+s+"\n"+i+"\n"+l+"\n"+f+"\n"+d+"\n"+str);
			
		}
		
		catch(IOException e )
		{
			e.printStackTrace();
		}

	}

}
