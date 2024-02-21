/**
 * 
 */
package gov.in.oupp.training.java.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author AKG
 * 
 */


public class DBConnectionTest2 {

	public static void main(String[] args) throws SQLException {
		
		final String URL = "jdbc:mysql://localhost:3306/ouppdb";	// drivers are automatically loaded by JAR file from jdk 1.6 onwards
		final String USERNAME = "root";
		final String PASSWORD = "root";
		
		//initialization
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try{
			
			//Load JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers loaded..");
			
			//jdbc connection object
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			System.out.println("Connection Established Successfully!!");

		
			// INSERT
			
			// SQL query
			String insertQuery = "insert into student values (?,?,?,?);";
			
			// prepared statement object for insert
			PreparedStatement insert = conn.prepareStatement(insertQuery);
			insert.setInt(1, 107);
			insert.setString(2, "Satyaban");
			insert.setInt(3, 23);
			insert.setString(4, "IT");
			
			int records = insert.executeUpdate();
			System.out.println("Records inserted: "+records);
			
			//INSERT
		
			
			
		//UPDATE
			// SQL query
			String updateQuery = "update student set age = ?, stream = ? where id = 103;";
			
//			// prepared statement object for update
			PreparedStatement update = conn.prepareStatement(updateQuery);
			update.setInt(1, 25);
			update.setString(2, "CSE");
			
			records = update.executeUpdate();
			System.out.println("Records updated: "+records);
			//UPDATE
			
		
			
			
			//DELETE
			// SQL query
			String deleteQuery = "delete from student where id = ?;";
			// prepared statement object for delete
			PreparedStatement delete = conn.prepareStatement(deleteQuery);
			delete.setInt(1, 104);
			
			records = delete.executeUpdate();
			System.out.println("Records updated: "+records);
			//DELETE
			
			
			//SELECT
			// statement object
			st = conn.createStatement();
			
			String selectQuery = "select * from student;";	
			//Cursor object for iterating over data and display 
			rs = st.executeQuery(selectQuery);
			System.out.println("DB OUTPUT: ");
			System.out.println("ID Name Age Stream\n------------------");
			while(rs.next()){
				// data extract syntax:  <ResultSet object>.get<Wrapper Class of column data-type>(<column no>)
				System.out.println(rs.getInt(1)+" "+
								   rs.getString(2)+" "+
								   rs.getInt(3)+" "+
								   rs.getString(4)
								   );
			}
			
			//SELECT
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			//closing statements
			conn.close();
			st.close();
			rs.close();
			
		}

	}

}
