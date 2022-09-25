package Static;

public class Static1 
{
	//static variables
	  static int count = 10;
	  static int calculate = 100;
	//Static method
    static void myMethod1()
    {
     System.out.println("This is static method 1");	
    }
    static void myMethod2()
    {
     System.out.println("This is static method 2");	
    }
    
    //Instance variable
    public String name;
    
    private int age;
	
    //Instance methods
    
    class test
    {
    	String name = " ";
    	public void testing(String name)
    	{
    		this.name = name;
    	}
    }
    
    class developer
    {
    	String name = " ";
    	public void development(String testname)
    	{
    		this.name = testname;
    	}
    }
	//This is main method
	public static void main(String[] args) 
	{
		System.out.println("The above are Static varaibles, Static methods ,Instance variables and methods");
	}

}
