package com.sumith.sep6th_labwork;

public class MyAutoClosable implements AutoCloseable {

	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void display(String str) {
		
		
		if(str==null) {
			throw new RuntimeException();
		}
		else
		{
			System.out.println("Yeh I dont have exception");
		}
	}
	
	public static void main(String[] args) throws Exception {
		MyAutoClosable m=new MyAutoClosable();
		try(m){
			m.display(null);
		}

}
}
