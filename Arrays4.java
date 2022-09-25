package Arrays;

public class Arrays4 
{
	public static boolean contains(int[] arr , int item)
	{
		for(int n : arr)
		{
			if(item == n)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
      int[] array = {2029, 2019, 2013, 4323, 2345,2012};
      
      System.out.println(contains(array, 2012));
      System.out.println(contains(array, 2022));

	}

}
