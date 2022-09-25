package Exceptions;

public class NoSuchMethodException 
{
	public void printer(String myString)
	{
	   System.out.println(myString);		
	}

	
}


class Myclass
{
	 public static void main(String[] args) 
	 {
		 NoSuchMethodException obj = new NoSuchMethodException();
		 
		 obj.printer("Hi there...");
	 }
}
