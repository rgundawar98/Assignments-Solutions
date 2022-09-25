package Loops;

import java.util.Scanner;

public class LoopsGenderCheck {
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      char gender ;
      
      System.out.println("Enter gender (M/m or F/f)");
      gender =sc.next().charAt(0);
      
      switch(gender)
      {
      case 'M':
      case 'm':
    	  System.out.println("Male");
    	  break;
    	  
      case 'F':
      case 'f':
    	  System.out.println("Female");
    	  break;
    	  
      default:
    	  System.out.println("Unspecified gender");
      }
	}
}
