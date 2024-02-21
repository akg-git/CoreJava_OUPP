/**
 * 
 */
package gov.in.oupp.training.java.corejava.exceptions;

/**
 * @author USER-108
 *
 */
public class MyTestClass {

	public static void main(String[] args) {
		
		int number;
		number=9;
		number=19;
		
		try{
			if(number<10){
				throw new NoMessageException("Unit digit is not allowed");
			}
			else{
				System.out.println("The Number is: "+number);
			}
		}catch(NoMessageException nme){
			System.out.println("NoMessageException: "+nme);
		}catch(Exception e){
			e.printStackTrace();		
		}
	}

}
