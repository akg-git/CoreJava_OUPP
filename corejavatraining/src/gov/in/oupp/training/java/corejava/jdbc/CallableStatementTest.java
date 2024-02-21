package gov.in.oupp.training.java.corejava.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author AKG
 *
 */

public class CallableStatementTest {

	public static void main(String[] args) throws SQLException {

		//DB Details
		final String URL = "jdbc:mysql://localhost:3306/ouppdb";
		final String USERNAME = "root";
		final String PASSWORD = "root";
		

		//initialization
		Connection conn = null;
		CallableStatement cst = null;
		ResultSet rs = null;
		
		try{
			
			
			//Load JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers loaded..");
			
			//jdbc connection object
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			System.out.println("Connection Established Successfully!!");
			
			String sqlQuery = "{call GetAllStudent()}";
			cst = conn.prepareCall(sqlQuery);
			rs = cst.executeQuery();
			
			System.out.println("student details\n-------------------------\nID\tName\tAge\tStream\n-----\t-------\t-----\t-----------");
			while(rs.next()){
				System.out.println(
						rs.getInt(1)+"\t"+
						rs.getString(2)+"\t"+
						rs.getInt(3)+"\t"+
						rs.getString(4)
						);
			}
			System.out.println("\n\nGetAllStudent() Procedure executed");
			
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			rs.close();
			cst.close();
			conn.close();
		}

	}

}
