package com.sumith.Oct5th_io_Program;

import java.io.*;

public class MyProgram
{
    
    public int getWordCount(File f) throws IOException
    {
    	int count=0;
    
    	
    	BufferedReader bos= new BufferedReader(new FileReader(f));
    				
    	String s;
    	
    	
    	try {
			while((s=bos.readLine())!=null)
			{
				String words[]=s.split(" ");
				
				for(String word:words)
				{
					if(!word.isEmpty()) 
					{
					count++;
					}
				}
			}
		} 
    	
    	catch (IOException e) {
			
			e.printStackTrace();
		}
		return count;
		
        
    }
    
     public int getCharacterCount(File f) throws IOException
    {
    	 int count=0;
    	 BufferedReader br=new BufferedReader(new FileReader(f)); 
    	 
    	String s;
    	try
    	{
    		while((s= br.readLine())!=null)
    		{
    			char []c=s.toCharArray();
    			for(char ch:c)
    			{
    				if(ch!=' ')//&&!Character.isDigit(ch)
    				{
    					count++;
    				}
    			}
    		}
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
		return count;
        
    }
    
     @SuppressWarnings("unused")
	public int getLineCount(File f) throws IOException
    {
    	 int count=0;
    	 
    	 BufferedReader br=new BufferedReader(new FileReader(f));
    	 String s;
    	 try
    	 {
    		 while((s=br.readLine())!=null)
    		 {
    			 count++;
    		 }
    	 }
    	 catch(IOException e)
    	 {
    		 e.printStackTrace();
    	 }
		return count;
        
    }
     
     public static void checkData() throws IOException
     {
    	 File f1=new File("/Users/sumith/Desktop/JavaIoFiles/WordCount.txt");
         
         
         MyProgram m=new MyProgram();
         System.out.println("Word count is:"+m.getWordCount(f1));
         System.out.println("Total characters are:"+m.getCharacterCount(f1));
         System.out.println("Number of lines :"+m.getLineCount(f1)); 
     }
    
    public static void main(String[] args) throws IOException
    {
    	
//        File f=new File("/Users/sumith/Desktop/JavaIoFiles/WordCount.txt");
//       
//        String s="abc def qhi\njkl MNoP 12d\nqrst uv wx yz";
//        
//        FileWriter bw=new FileWriter(f); 
//        bw.write(s);
        
       MyProgram.checkData();
       
//        bw.close();
       
    }
}