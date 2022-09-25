package ThisSuperKeyword;

//Print instance member of parent class using super 
class Bike 
{
	int maxSpeed = 180;
}

class Car extends Bike 
{
	int maxSpeed = 220;
	
	void display()
	{
	  System.out.println("Maximum speed" + super.maxSpeed);
	}
}

class Main
 {
	public static void main(String[] args) 
	{
	 Car C = new Car();
	 C.display();

	}

 }
