package Exceptions;

public class Demo3 
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

	}

}
