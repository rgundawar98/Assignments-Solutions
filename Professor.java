package Inheritance;

 class Professor 
 {
	 public void displayInfo()
	 {
		 System.out.println("I am a professor");
	 }
 }
 
 class Student extends Professor
 {
	 public void displayInfo()
	 {
		 super.displayInfo();
		 System.out.println("I am a student");
	 }
	 
  }

 class Main
 {
	public static void main(String[] args) 
	{
	  Student s1 = new Student();
	  s1.displayInfo();
    
	}
 }


