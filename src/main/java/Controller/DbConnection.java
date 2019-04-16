package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
	    	String url="jdbc:sqlserver://vNTDACWSSQLD002:1433;databaseName=DEV_TEST;";
	    	String password="dev_test_dbo123";
	    	String user="dev_test_dbo";
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection con=DriverManager.getConnection(url, user, password);
	    	Statement stm =con.createStatement();
	    	stm.executeUpdate("insert into T_Refat "+ "VALUES('Ana','20000')");
	    	 
	    		String SQL = "SELECT * FROM t_Refat";
	    		ResultSet rs = stm.executeQuery(SQL);
	    		while(rs.next()) {
	    			  System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("salary")+" ");
	    			  }
	        
		}catch( Exception e){
			System.out.println(e);
			
		}
	}
}
		
