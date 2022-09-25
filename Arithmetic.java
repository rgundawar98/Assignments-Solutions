package MethodOverloading;


public class Arithmetic 
{
   void sub(int a , int b)
   {
	   System.out.println("Substraction is :"+(a -b) );
   }
   
   void sub(double a , double b)
   {
	   System.out.println("Substraction is : "+(a - b));
   }
	public static void main(String[] args) 
	{
     Arithmetic art = new Arithmetic();
     art.sub(120, 80);
     art.sub(12.3, 1.5);

	}

}
