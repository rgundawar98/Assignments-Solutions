package AbstractClass;


//Calling abstract method from child class
  abstract class Parent 
  {
	  abstract void m1();
	  
	  void m2()
	  {
		  System.out.println("This is "+ "a concrete method");
	  }
  }
  
  class child extends Parent
  {
	 void m1()
	 {
		 System.out.println("child's  "+"implementation of m1 ");
	 }
  }
  
  class AbstractMethod
  {
	public static void main(String[] args) 
	{
        child ch = new child();
        ch.m1();
        ch.m2();
	}

}
