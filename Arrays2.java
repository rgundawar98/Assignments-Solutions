package Arrays;

public class Arrays2 
{
	public static void main(String[] args) 
	{
     int [] array = {10, 20, 30, 40, 50, 60, 70, 80};
     
     int length = array.length;
     
     int sum = 0;

     for(int i = 0; i<array.length; i++)
     {
    	 sum += array[i];
     }
     
     double average = sum/length;
     System.out.println("Average of the numbers in array is "+average);
     
	}

}
