package AccessModifier;

class BaseClass
{
	void display()
	{
		System.out.println("BaseClass :: Display with 'default' scope");
	}
}
public class DefaultAccessModifier 
{
	public static void main(String[] args) 
	{
	  BaseClass obj = new BaseClass();
	  obj.display();

	}

}
