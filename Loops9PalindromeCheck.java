package Loops;

public class Loops9PalindromeCheck 
{
	public static void main(String[] args) 
	{
      int r , sum=0 , temp;
      int n = 454;
      temp = n;
      while(n>0)
      {
    	  r = n%10;
    	  sum = (sum*10) + r;
    	  n = n/10;
      }
      if(temp == sum)
      {
    	  System.out.println("Number is palindrome");
      }
      else
      {
    	  System.out.println("IS not palindrome");
      }
	}

}
