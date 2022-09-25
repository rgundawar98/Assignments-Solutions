package Interface;

interface Interface1 
{
//  final int a = 100;
  
  public static void display()
  {
	  System.out.println("This is my country");
  }
  
}

class Test implements Interface1
{
	public void display()
	{
		System.out.println("Test ride Speed");
	}
	
  	public static void main(String[] args) 
  	{
	 Test t = new Test();
	 t.display();
//	 System.out.println(a);

	}

}
