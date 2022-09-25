package Loops;

import java.util.Scanner;

public class Loops4 
{
	public static void main(String[] args) 
	{
     int a , b , c , temp , largest;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first number");
     a = sc.nextInt();
     
     System.out.println("Enter the second number");
     b = sc.nextInt();
     
     System.out.println("Enter the third number");
     c = sc.nextInt();
     
     temp = a>b?a:b;
     
     largest = c>temp?c:temp;
     
     System.out.println("The largest number among three of them is "+largest);
	}

}
