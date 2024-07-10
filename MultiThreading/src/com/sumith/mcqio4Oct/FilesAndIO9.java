package com.sumith.mcqio4Oct;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesAndIO9
{
    public static void main(String args[])throws IOException
    {
        FileOutputStream fileOut = new FileOutputStream("/Users/sumith/Desktop/JavaIoFiles/hai.txt");
          
        BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);
  
        for(int i = 70; i < 80; i++)
        {
            bufferOut.write(i);
        }
        bufferOut.flush();
        bufferOut.close();
        fileOut.close();
        System.out.println("Completed");
    }
}