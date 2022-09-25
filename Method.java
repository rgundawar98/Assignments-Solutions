package Exceptions;

//program with finally block
public class Method 
{
	public static void main(String[] args) 
	{
		try
		  {
			  int res = 5 / 0;
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("ArithmeticException => "+ e.getMessage());
		  }
		  finally
		  {
			  System.out.println("This is finally block");
		  }
	}

}
