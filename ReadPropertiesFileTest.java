package JAVAIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileTest 
{
	public static void main(String[] args) throws IOException 
	{
	   Properties pro = readPropertiesFile("C:\\Users\\Admin\\workspace\\JavaPractices\\src\\JAVAIO\\Credentials.properties");
	   System.out.println("Username "+pro.getProperty("username"));
	   System.out.println("Password "+pro.getProperty("password"));
	}

	public static Properties readPropertiesFile(String fileName) throws IOException 
	{
	  FileInputStream fis = null;
	  Properties pro = null;
	  
	  try
	  {
		  fis = new FileInputStream(fileName);
		  pro = new Properties();
		  pro.load(fis);
	  }
	  catch(FileNotFoundException fe)
	  {
		  fe.printStackTrace();
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
	  finally
	  {
		  fis.close();
	  }
	return pro;
		
	}

}
