package JAVAIO;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) 
	{
	  try
	  {
		  FileWriter fw = new FileWriter("myfile1.txt");
		  
		  try
		  {
			fw.write("Java programming is best language"); 
			fw.write("Java is a oops based language");
			
		  }
		  finally
		  {
			  fw.close();
		  }System.out.println("Successfully wrote data in a file");
	  
	  }
	  catch(IOException e)
	  {
		  System.out.println(e);
	  }

	}

}
