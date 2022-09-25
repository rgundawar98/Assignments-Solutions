package JAVAIO;

import java.io.FileReader;
import java.io.IOException;

public class fileReader 
{
	public static void main(String[] args) 
	{
       
		try
		{
		  FileReader fr = new FileReader("C:\\Users\\Admin\\workspace\\JavaPractices\\src\\JAVAIO\\test.txt");
		  
		  try
		  {
			  int i;
			  while((i=fr.read())!= -1)
			  {
				  System.out.print((char)i);
			  }
          }
		  finally
		  {
			  fr.close();
		  }
		}
		catch(IOException e)
		{
			System.out.println("Exception handeled...");
		}

	}

}
