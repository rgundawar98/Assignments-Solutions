package Exceptions;

public class ShowArithmeticException
{
	public static void main(String[] args) 
	{
		try
		  {
			  int res = 5 / 0;
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("ArithmeticException  ");
		  }
		  finally
		  {
			  System.out.println("This is finally block");
		  }


	}

}
