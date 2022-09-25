package JAVAIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteDataToFile 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
       FileOutputStream fos = new FileOutputStream("myfile.txt");
       PrintWriter pw = new PrintWriter(fos);
       
       pw.println("I love Java");
       pw.println("I am interested to learn new things in java");
       pw.println("I am very much exited to learn Input Output stream in java");
       pw.println(121);       
       pw.close();

	}

}
