package Constructors;

public class Animal 
{
	public Animal() 
	{
	  System.out.println("This is default Constructor");	
	}
	
	int id;
	String name;
	
	private Animal(int i)
	{
	  id = i;
	}
	
	protected Animal(int i , String n)
	{
		id = i;
		name = n;
	}
	

}
