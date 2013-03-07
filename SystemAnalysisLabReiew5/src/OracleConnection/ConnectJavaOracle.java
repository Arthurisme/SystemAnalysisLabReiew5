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
		
		
		{//try begin:
		System.out.println("  ********************************  ");
		System.out.println("  CREATION OF TABLES FOR LAB REVIEW 5  ");
		System.out.println("  ********************************  ");

		}//try end.
		
	}

}
