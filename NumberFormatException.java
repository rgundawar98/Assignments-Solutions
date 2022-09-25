package Exceptions;

import java.util.Scanner;

public class NumberFormatException 
{
	public static void main(String[] args) 
	{
		int number;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter any valid Integer");
			
			try
			{
				number = Integer.parseInt(sc.next());
	            System.out.println("Your entered number "+number);
				break;
			}
			catch(Exception e)
			{
				System.out.println("Number format exception occurs");
			}
		}
	}

}
