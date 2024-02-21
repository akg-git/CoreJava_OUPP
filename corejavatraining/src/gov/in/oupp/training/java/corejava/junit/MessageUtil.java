/**
 * 
 */
package gov.in.oupp.training.java.corejava.junit;

/**
 * @author AKG
 *
 */
public class MessageUtil {
	
	private String message;
	
	//default constructor
	public MessageUtil(){}
	
	//parameterized constructor
	public MessageUtil(String message){
		this.message = message;
	}
	
	//print message
	public String printMessage(){
		System.out.println(message);
		return message;
	}
	
	//salutation message
	public String salutationMessage(){
		message = "Hello! "+message;
		System.out.println(message);
		return message;
	}

}
