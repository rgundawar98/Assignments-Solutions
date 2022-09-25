package Interface;

//Create an interface with static final  variable 
 interface New 
 {
   int amount = 10;  //public +static +final
   void purchase();
 }
 class Old implements New
 {
	 public void purchase()
	 {
		 System.out.println("Raj needs "+amount+"kg rice");
	 }
 }
 class check
 {
	 public static void main(String args[])
	 {
		 Old o = new Old();
		 o.purchase();
	 }
 }
 
 