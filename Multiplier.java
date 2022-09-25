package MethodOverloading;

 class Multiplier 
 { 
	 void mul(int a , int b)
	 {
		 System.out.println("Multiply is : "+(a * b));
	 }
	 
	 void mul(double a , double b)
	 {
		 System.out.println("Multiply is : "+(a * b));
	 }

	public static void main(String[] args) 
	{
     Multiplier mu  = new Multiplier();
     mu.mul(12, 8);
     mu.mul(2.3, 1.5);
	}

}
