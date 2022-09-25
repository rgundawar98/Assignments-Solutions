package Constructors;

public class MyClass1 
{

     MyClass1() 
	{
	   this(10);
	   System.out.println("This is a Default Constructor");
	}
     
    MyClass1(int x)
    {
    	this(5, 15);
    	System.out.println(x);
    }
    
    MyClass1(int x , int y)
    {
       System.out.println(x + y);
    }
    
    public static void main(String[] args) 
    {
	  new MyClass1();	
	}

}
