package Static;

public class Static4 
{
	//call instance method into static method
    void disp()
    {
    	int a = mul();
    	System.out.println("Multiplication "+a);
    }
    
    static int mul()
    {
    	int x = 10 , y = 20;
    	int z = x * y;
		return z;
    	
    }
	public static void main(String[] args) 
	{
		Static4 obj = new Static4();
		obj.disp();

	}

}
