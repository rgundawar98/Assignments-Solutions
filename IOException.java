package Exceptions;

import java.util.Scanner;

public class IOException 
{
	public static void main(String[] args) throws Exception 
	{
          String s = "Mine is Mine";
    	  
    	  Scanner scan = new Scanner(s);
    	  
    	  System.out.println(""+scan.nextLine());
    	  
    	  System.out.println(""+scan.ioException());
         
    	  scan.close(); 
      }

}

