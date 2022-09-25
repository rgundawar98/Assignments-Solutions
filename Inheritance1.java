package Inheritance;

class Bike{
    public int gear;
    public int speed;

    public Bike(int gear , int speed)
    {
   	   this.gear = gear;
	   this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
	   speed -= decrement;
    }
    public void speedUp(int increment)
    {
	   speed += increment;
    }
    public String toString()
    {
	   return ("No of gears are " +gear+ "\n" + " Speed of bike " + speed);
    }
}
 class MountainBike extends Bike
 {
	 public int seatHeight;
	 
	 public MountainBike(int gear , int speed , int startHeight)
	 {
		 super(gear , speed);
		 seatHeight = startHeight;
	 }
	 
	 public void setHeight(int newValue)
	 {
		 seatHeight  = newValue;
	 }
	 
	 @Override public String toString()
	 {
		 return(super.toString() + "\n Seat height is " +seatHeight);
	 }
 }
public class Inheritance1 
{
	public static void main(String[] args) 
	{
       MountainBike mbike = new MountainBike(3 ,100 ,26);
       System.out.println(mbike.toString());

	}

}
