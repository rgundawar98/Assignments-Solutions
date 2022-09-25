package JAVAIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderfromTextFile 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
      File file = new File("C://Users//Admin//workspace//JavaPractices//src//JAVAIO//Text.file");
      Scanner sc = new Scanner(file);
      
      while(sc.hasNextLine())
      {
    	 System.out.println(sc.nextLine()); 
      }
	}

}
