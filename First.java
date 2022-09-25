package Interface;

interface First 
{
	   
     static void printweek()
   {
	   System.out.println("This is an week");
   }
}
 
class Second implements First
   {
     public static void main(String[] args) 
     {	
        Second ss = new Second();
        ss.printyear();
     }

	private void printyear() {
		System.out.println("This is a year");
		
	}	
}
