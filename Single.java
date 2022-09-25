package ThisSuperKeyword;

//Calling a constructor of parent class using super
public class Single 
{
  public Single()
  {
	  System.out.println("This is a single constructor is a default");
  }
  
  public Single(int i , int j)
  {
	  System.out.println("This is a parametreized constructor");
  }
}

class Double extends Single
{
	public Double()
	{
		super(10 , 20);
		System.out.println("Double");
	}
	
	public Double(int i , int j)
	{
		System.out.println("Double d");
	}
 }

class Another
{
	public static void main(String[] args) 
	{
	 	Double obj = new Double();
	}

}
