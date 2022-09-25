package Exceptions;

public class Demo 
{
    void divide(int a , int b)
    {
    	int res = a/b;
    	System.out.println("Division process has been done");
    	System.out.println("Result of the division"+res);
    }
    
	public static void main(String[] args) 
	{
	  Demo obj = new Demo();
	  obj.divide(1, 0);
	}

}
