package Exceptions;

public class MultipleCatchBlock 
{
	public static void main(String[] args) 
	{
	  try{
		  int a[] = new int[5];
		  a[5] = 30/0;
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("Arithmetic Exception Occurs");
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println("ArrayIndexOutOfBoundsException occurs");
	  }
	  
	  System.out.println("Rest of the code");

	}

}
