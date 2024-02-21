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

import com.mysql.cj.jdbc.Blob;

/**
 * @author AKG
 * 
 */

public class DBConnectionTest {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/ouppdb"; 
		String userName = "root";
		String password = "root";

		try {

			// Load JDBC Driver
			// drivers are automatically loaded by JAR  file from jdk 1.6 onwards
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers loaded..");

			// jdbc connection object
			Connection conn = DriverManager.getConnection(url, userName, password);

			System.out.println("Connection Established Successfully!!");

			// // statement object
			Statement st = conn.createStatement();

			String query = "select * from student;";
			// Cursor object for iterating over data and display
			ResultSet rs = st.executeQuery(query);
			System.out.println("DB OUTPUT: ");
			System.out.println("ID Name Age Stream\n------------------");
			while (rs.next()) {
				// data extract syntax: <ResultSet object>.get<Wrapper Class of
				// column data-type>(<column no>)
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
