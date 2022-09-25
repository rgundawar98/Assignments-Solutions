package ThisSuperKeyword;

//call the constructor in a current class using this() method
public class One 
{
    One()
    {
    	System.out.println("This is default constructor");
    }
    
    One(int x)
    {
    	//calling default constructor from parameterized constructor
    	this();
    	System.out.println(x);
    }
}

 class Min
 {
	public static void main(String[] args) 
	{
       One a = new One(12);		
	}

}
