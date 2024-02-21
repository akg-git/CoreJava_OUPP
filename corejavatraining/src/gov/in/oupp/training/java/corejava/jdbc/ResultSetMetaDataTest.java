package gov.in.oupp.training.java.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * @author AKG
 *
 */


public class ResultSetMetaDataTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		//DB Details
		final String URL = "jdbc:mysql://localhost:3306/ouppdb";
		final String USERNAME = "root";
		final String PASSWORD = "root";
		

		//initialization
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try{

			//Load JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers loaded..");
			
			//jdbc connection object
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String sql = "select * from student;";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			//get result set meta data
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Student Table\n--------------------");
			System.out.println("Total columns = "+rsmd.getColumnCount());
			System.out.println("Column Name   = "+rsmd.getColumnName(1));
			System.out.println("Column Type   = "+rsmd.getColumnType(2));
			System.out.println("3rd Column TypeName = "+rsmd.getColumnTypeName(2));
			System.out.println("3rd Column Label = "+rsmd.getColumnLabel(3));
			
			
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();
			pst.close();
			conn.close();
		}

	}

}
