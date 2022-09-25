package Exceptions;

import java.util.Scanner;

public class StringIndexOutOfBoundException 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the input text");
       
       try
       {
    	   char c = sc.nextLine().charAt(4);
    	   System.out.println("The character index at 4");
    	   
       }
       catch(Exception e)
       {
    	   System.out.println("Caught Exception "+e.toString());
       }

	}

}
