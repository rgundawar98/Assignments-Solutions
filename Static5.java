package Static;

public class Static5
{
	//Print static variable and instance variabke from main method
	
	static int count; //static variable
	 
	int roll;

	
	public static void main(String[] args) 
	{
       Static5 obj1 = new Static5();
       obj1.count = 500;
       System.out.println("Value of Static variable is "+obj1.count);
       obj1.roll = 100;
       System.out.println("Value of instance variable is "+obj1.roll);
	}

}
