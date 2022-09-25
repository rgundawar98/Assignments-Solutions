package Static;

public class StaticMethodCall 
{

	static int add()
	{
		int x= 20 , y =30;
		int z = x + y;
		return z;
	}
	
	void disp()
	{
		int a = add();
		System.out.println("Addition "+a);
	}
	public static void main(String[] args) 
	{
		StaticMethodCall obj = new StaticMethodCall();
		obj.disp();
		obj.add();
		System.out.println("Value is "+obj.add());

	}

}
