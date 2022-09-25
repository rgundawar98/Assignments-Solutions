package Loops;

import java.util.Scanner;

public class Loops10EvenOddCheck 
{  
	public static void main(String[] args) 
 	{
 	  Scanner sc = new Scanner(System.in);
 	   int number;
 	   System.out.println("Enter a positive integer number");
 	   number = sc.nextInt();
 	   
 	   switch(number%2)
 	   {
 	   case 0:
 		   System.out.println(number+" is an Even Number");
 		   break;
 		   
 	   case 1:
 		   System.out.println(number+" is an Odd Number");
 		   break;
 	   }
 	}
 	
}


