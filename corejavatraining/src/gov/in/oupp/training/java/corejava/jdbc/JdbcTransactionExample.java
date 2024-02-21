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

public class JdbcTransactionExample {

	public static void main(String[] args) throws SQLException {
		
		//DB Details
		final String URL = "jdbc:mysql://localhost:3306/ouppdb";
		final String USERNAME = "root";
		final String PASSWORD = "root";
		
		try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
			
			//disable auto-commit
			connection.setAutoCommit(false);
			
			try{
				
				//perform a money transfer
				//	[Connection connection, int fromAccountId, int toAccountID, double amount]
				transferMoney(connection, 3, 5, 16000.00);
				
				//commit the transaction
				connection.commit();
				System.out.println("Transaction committed successfully!");
				
				
			}catch(SQLException sqle){
				//Rollback the transaction in case of any interruption
				connection.rollback();
				System.out.println("Transaction rolled back due to the exception: "+sqle);
				sqle.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}

			
		}

	}

	private static void transferMoney(Connection connection, int fromAccountId, int toAccountID, double amount) throws SQLException{
		
		//EXPERIMENT
		Statement st = connection.createStatement();
		
		String selectQuery = "select * from bank_accounts;";	
		//Cursor object for iterating over data and display 
		ResultSet rs = st.executeQuery(selectQuery);
		
		Double availableAmount = 0.00;
		while(rs.next()){
			int account_id = rs.getInt(1);
			if(account_id == fromAccountId){
				
				availableAmount = rs.getDouble(2);
//				System.out.println(availableAmount);
			}	
		}
		
//		if(availableAmount > amount)
		//EXPERIMENT
		
		
		

		//Deduct money from the source account
		updateAccountBalance(connection, fromAccountId, -amount);
		
		//Add money from the destination account
		updateAccountBalance(connection, toAccountID, amount);
		
	}

	private static void updateAccountBalance(Connection connection, int accountId, double amount) throws SQLException{

		String sql = "UPDATE bank_accounts SET balance  = balance + ? WHERE account_id = ? ;";
		
		try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
			
			preparedStatement.setDouble(1, amount);
			preparedStatement.setInt(2, accountId);
			preparedStatement.executeUpdate();
			
		}
		
	}

}
