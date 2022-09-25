package Exceptions;

 class CustomException extends Exception 
{
	 String message;
	 CustomException(String str)
	 {
		 message = str;
	 }
	 
	 public String toString()
	 {
		 return("Custom Excepton Occurs" +message);
	 }
}
 class Main
 {
	public static void main(String[] args) 
	{
     try
     {
    	 throw new CustomException("This is a custom Exception");
     }
     catch(CustomException e)
     {
    	 System.out.println(e);
     }

	}

 }
