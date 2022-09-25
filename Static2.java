package Static;

public class Static2 
{
	//Instance variable
    public int k;
    
    //Constructor to set value to instance variable
    public Static2(int k)
    {
    	this.k =k;
    }
    
    //set method for instance variable
    public void setK()
    {
    	this.k = k;
    }
    
    //get method for instance variable
    public int getK()
    {
    	return k;
    }
	public static void main(String[] args) 
	{
		//Calling that class where the instance variable present
		Static2 st = new Static2(10);
		
		System.out.println("Value of k is " +st.getK());

	}

}
