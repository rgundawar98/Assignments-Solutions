package Exceptions;

import java.io.IOException;

public class Demo2 
{
	void method()throws IOException
	{
		System.out.println("Device operation performed");
	}
}
 
class Test
{
	public static void main(String[] args) throws IOException 
	{
      Demo2 obj = new Demo2();
      obj.method();
      
      System.out.println("Normal Flow");

	}

}
