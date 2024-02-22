/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops;

/**
 * @author AKG
 *
 */

class user{
	// confidential variables has to be private
	private String userName;
	private String password;
	
	private void login(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
	
	void getDetails(){
		//calling login() from a public method
		login(userName, password);
	}
}

public class Encapsulation {


	public static void main(String[] args) {
		
		

	}

}
