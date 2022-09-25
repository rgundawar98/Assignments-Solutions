package Constructors;

public class Two
{
	int rollNumber;
	String name;

	public Two() 
	{
	  System.out.println("Default constructor");
	}
    
	public Two(int i , String n)
	{
		rollNumber =i;
		name = n;
	}
	void show()
	{
		System.out.println("This is rollNumber "+rollNumber+" and name is "+name);
	}
}   
	
class MyClass
{
	public static void main(String[] args) 
	{
     Two t = new Two(121 , "Rohit kumar");
     
     t.show();
     
	}

}
