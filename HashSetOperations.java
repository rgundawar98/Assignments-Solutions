package Collections;

import java.util.HashSet;

public class HashSetOperations 
{
	private static int initialCapacity;
	private static float loadFactor;

	public static void main(String[] args) 
	{
     HashSet<Integer> hset = new HashSet<>(initialCapacity=6,loadFactor=0.2f);
     //Operations of HashSet
     hset.add(100);
     hset.add(120);
     hset.add(123);
     System.out.println("Hashset is "+hset);
     //Remove Element from HashSet 
     hset.remove(123);
     System.out.println("Hashset is "+hset);
     //Clone of new HashSet
     hset.clone();
     System.out.println("New Hashset is "+hset);
     //Element Contains or not 
     boolean element = hset.contains(120);
     System.out.println("It is present or not "+element);
     //Is empty or not
     boolean element2 = hset.isEmpty();
     System.out.println("It is Empty or not "+element2);
     //size
     hset.size();
     System.out.println("Hashset size is "+hset);
     

	}

}
