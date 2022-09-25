package Exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLException 
{
	public static void main(String[] args) throws Exception 
	{
      String update_query = "update employee_details set email='Anyone@mail.com' where empNum1 = 10011";
      
      Class.forName("oracle.jdbc.driver.OracleDriver");
      try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system/pass123@localhost:1521:XE"))
      {
    	  Statement state1 = conn.createStatement();
    	  ResultSet rs1 = null;
    	  state1 = conn.createStatement();
    	  System.out.println("Excecuting Update query using executeUpdate method");
    	  int return_rows = state1.executeUpdate(update_query);
    	  System.out.println("No. of affected rows= "+return_rows);
      }
      catch(Exception e)
      {
    	  System.out.println("Message = "+ e.getMessage());
    	  System.out.println("PrintTrace ");
    	  e.printStackTrace(); 	  
      }

	}

}
