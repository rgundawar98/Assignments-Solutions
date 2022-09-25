package ThisSuperKeyword;

import java.util.Scanner;

//Call argument constructor from current class using this() method
public class Student 
{ 
	private String name;
	private int age;
	
	Student(String name , int age)
	{
		this.setName(name);
		this.setAge(age);
	}
	
    public void setName(String name)
    {
    	this.name = name;
    }
    public void setAge(int age)
    {
    	this.age = age;
    }
    
    public void display()
    {
    	System.out.println("Name of the student is "+this.name);
    	System.out.println("Age of the student is "+this.age);
    }
	
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the name of student ");
	  String name = sc.nextLine();
	  System.out.println("Enter the age of student ");
	  int age = sc.nextInt();
	  
	  new Student(name , age).display();

	}

}
