package Strings;

public class String1 
{	 
	public static void main(String[] args) 
	{
		//Creating a String using two types
		//Using literals
		String s1 = "This is sample code";
		//Using new keyword
		String s2 = new String("This is another sample code"); 
		String a = "Hello";
		String b = "World!";
		
		String s = "Hello" + " World!";
		System.out.println("Concatenation of two Strings are "+s);
     
		String name = "Education";
		int length = name.length();
		System.out.println("The length of the string "+name + " is " +length);

		//Extract Substring from String 
		System.out.println(name.substring(2));
		System.out.println(name.substring(5));
		
		//Using indexOf() method
		String myString = "We leave on the earth";
		System.out.println(myString.indexOf("leave"));
		
		
		String str = "Welcome to gaming room";
		System.out.print("Return value ");
		System.out.println(str.matches("Welcome(.*)"));
		System.out.println(str.matches("(.*)to(.*)"));
		
		
		String Str1 = "Hello";
		String Str2 = "Hello";
		String Str3 = "  Hello World!";
		System.out.print("Strings are equals or not :");
		System.out.println("\n" + Str1.equals(Str2));
		System.out.println(Str2.equals(Str3));
		
		System.out.println(Str3.trim());
		
		String Str4 = "Hello";
		System.out.println(Str4.replace('l', 'p'));
		
		String Str5 = "Earth is a planet";
		String[] words = Str5.split("\\s");
		for(String w:words)
		{
			System.out.println(w);
		}
		
		//String UpperCase and String LowerCase 
		String Str6 = "hello world!";
		String Str7 = "HELLO WORLD!";
		System.out.println(Str6.toUpperCase());
		System.out.println(Str7.toLowerCase());
		
		//EqualsIgnoreCase() method
		System.out.println(Str6.equalsIgnoreCase(Str7));
		System.out.println(Str2.equalsIgnoreCase(Str3));
		
		//StartsWith() method
		System.out.println(Str7.startsWith("H"));
		
		//EndsWith() method
		String Str8 = "StackOverflow";
		System.out.println(Str8.endsWith("ow"));
		
		//CompareTo() method
		System.out.println(Str1.compareTo(Str6));
		System.out.println(Str1.compareTo(Str2));
		
		//Converting a integer to string
		int c = 12324;
		String Str9 = String.valueOf(c);
		System.out.println("Value of integer to String is Str9 = "+Str9);
		
		//Converting integer object to string
		int d = 15678;
		Integer obj = new Integer(d);
		String Str10 = obj.toString();
		System.out.println("Value of integer object to string is Str10 = "+Str10);
		
	}

}
