package Operators;

public class Operator4 
{
	public static void main(String[] args) 
	{
     	 	int x = 10;
     	 	int y = 20;
     	 	int z = 20;
     	 	int sum , sub;
     	 	int Larger = 100000;
     	 	float smaller = 0.5f;
     	 	if(x<y && y==z)
     	 	{
     	 		sum = x + z;
     	 		System.out.println(sum);
     	 	}
            
     	 	if(x<y || y>z)
     	 	{
     	 		sum = x + y + z;
     	 		System.out.println(sum);
     	 	}
     	 	
     	 	if(x != y)
     	 	{
     	 		sub = z - x;
     	 		System.out.println(sub);
     	 	}
     	 	
     	 	if(x < y)
     	 	{
     	 		System.out.println(y);
     	 	}
     	 	
     	 	if(z > x)
     	 	{
     	 		System.out.println(y);
     	 	}
     	 	
     	 	if(x <= z)
     	 	{
     	 		sum = x + z;
     	 		System.out.println(sum);
     	 	}
     	 	
     	 	if(y >= x)
     	 	{
     	 		sub = y - x;
     	 		System.out.println(sub);
     	 	}
     	 	
     	 	System.out.println(smaller);
     	 	System.out.println(Larger);
	}

}
