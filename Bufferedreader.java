package JAVAIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedreader 
{
	public static void main(String[] args) throws IOException 
	{
      int i;
      BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\Admin\\workspace\\JavaPractices\\src\\JAVAIO\\test.txt"));
      while((i = bfr.read())!= -1)
      {
    	  System.out.println((char)i);
      }
      bfr.close();
	}

}
