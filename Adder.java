package MethodOverloading;

class Adder 
{
	void add(int a , int b)
	{
		System.out.println("Sum = "+(a+b));
	}
	
	void add(double a , double b)
	{
		System.out.println("Sum = "+(a+b));
	}

	public static void main(String[] args) 
	{
      Adder ad = new Adder();
      ad.add(5, 6);
      ad.add(22.3, 4.5);
	}

}
