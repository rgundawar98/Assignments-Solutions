package Static;

public class Static3 
{
	// call static method  into instance method
	 static int add()
	 {
		 int x = 10 , y = 20;
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
     	Static3 obj = new Static3();
     	obj.disp();

	}

}
