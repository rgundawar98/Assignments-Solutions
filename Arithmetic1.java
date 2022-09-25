package MethodOverloading;

public class Arithmetic1
{
  void add(int a , int b)
  {
	System.out.println("Addition is : "+(a+b));
  }
  
  void mul(double a , double b ,double c)
  {
	  System.out.println("Multiplication is: "+(a*b*c));
  }
  
  public static void main(String[] args) 
  {
	Arithmetic1 obj1 = new Arithmetic1();
	obj1.add(100, 50);
	obj1.mul(12, 12, 12);
  }
}
