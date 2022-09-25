package Exceptions;

public class ClassNotFoundException 
{
	public static void main(String[] args) 
	{
     try
     {
    	 Class.forName("This is my String");
    	 
    	 ClassLoader.getSystemClassLoader().loadClass("This is my String");
    	 
     }
     catch(Exception e)
     {
    	 e.printStackTrace();

     }
	}

	
 }










//try
//{
//	Class.forName("myPackage.example");
//}
//
//catch(ClassNotFoundException ex)
//{
//	ex.printStackTrace();   	 
//}