/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops;


/**
 * @author AKG
 *
 */
public class TestReturningObject {

	public static void main(String args[]){
		Addition add1 = new Addition(10,20);
		
		//returning an object, so need to store in an object datatype
		Addition add2 = add1.add();
	}
}