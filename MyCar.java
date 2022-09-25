package Inheritance;

public class MyCar 
{
   public void Testing()
   {
	   System.out.println("The car is going as fast as it can!");
   }
   
   public void Speed(int maxSpeed)
   {
	   System.out.println("Max speed is "+maxSpeed);
   }
   
	public static void main(String[] args) 
	{
	  MyCar myCar = new MyCar();
	  myCar.Testing();
	  myCar.Speed(200);
	}

}
