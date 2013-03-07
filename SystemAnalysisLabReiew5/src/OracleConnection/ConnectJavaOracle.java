package OracleConnection;

import java.sql.*;

public class ConnectJavaOracle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Connect to oracle here:
		ConnecttoOracle("scott","tiger");
	}
	
	public static   void ConnecttoOracle(String username,String password)
	{
		//Declare a null Connection:
		Connection c=null;
		
		try
		{//try begin:
		System.out.println("  ********************************  ");
		System.out.println("  CREATION OF TABLES FOR LAB REVIEW 5  ");
		System.out.println("  ********************************  ");

		System.out.println("* Loading the driver  *");
		
	//declare the connection:
		//Set driver name:		 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("****** Creating Faculty table  ******");

			String query="";
		
		

		
		
		
		
		}//try end.
	  catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		// try 4
	}

}
