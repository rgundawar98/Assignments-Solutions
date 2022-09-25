package Loops;

import java.util.Scanner;

public class Loops5 
{
	public static void main(String[] args) 
	{
     int number , i;
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the limit");
     number = sc.nextInt();
     i = 10;
     System.out.println("List of even numbers");
     while(i <= number)
     {
    	 System.out.println(i+" ");
    	 i = i+2;
     }
     
	}

}
