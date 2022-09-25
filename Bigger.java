package AbstractClass;
 
//calling non abstract method from child class
   abstract class Bigger 
   {
      void gear()
      {
    	  System.out.println("This bike has six gears");
      }
   } 
   
   class smaller extends Bigger
   {	   
	   public static void main(String[] args) 
	   {
		   smaller sm = new smaller();
		   sm.gear();       
		   
	   }
   }
   





