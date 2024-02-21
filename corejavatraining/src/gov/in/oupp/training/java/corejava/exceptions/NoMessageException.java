/**
 * 
 */
package gov.in.oupp.training.java.corejava.exceptions;

/**
 * @author AKG
 *
 */
public class NoMessageException extends Exception{
	
	String message;
	
	NoMessageException(){}
	
	NoMessageException(String message){
		this.message = message;
	}

	@Override
	public String toString() {
		return "NoMessageException: " + message;
	}
	
	

}
