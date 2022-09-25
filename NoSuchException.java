package Exceptions;

public class NoSuchException 
{
	public static void main(String[] args) 
	{
      try
      {
    	String obj = new String();
    	Class cls = obj.getClass();
    	
    	java.lang.reflect.Field fld = cls.getField("name");
        System.out.println("Field Found "+ fld.toString());    	
      }
      catch(Exception e)
      {
    	  System.out.println("Exception "+e);
      }
      System.out.println("Program Finished");
	}

}
