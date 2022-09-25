package Interface;

//Create an interface with public, private and protected method
interface Trial
 {
	 
 }	 
	
 class Undo implements Trial
 {
	 private void printyear() 
	 {
		 System.out.println("This is a year");
	 }
	 public void printweek()
	 {
		 System.out.println("This is a week");
	 }
	 protected void printday()
	 {
		 System.out.println("This is a day");
	 }
 }

