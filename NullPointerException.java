package Exceptions;

public class NullPointerException 
{
	public static void main(String[] args) 
	{
       String ptr = null;
       
       try
       {
    	   if(ptr.equals("gfg"))
    		   System.out.println("Same");
    	   else
    		   System.out.println("Not Same");
       }
       catch(Exception e)
       {
    	   System.out.println("Null Pointer Exception");
       }
	}
}
