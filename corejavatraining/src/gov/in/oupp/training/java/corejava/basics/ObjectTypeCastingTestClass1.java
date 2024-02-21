/**
 * 
 */
package gov.in.oupp.training.java.corejava.basics;

/**
 * @author AKG
 *
 */
public class ObjectTypeCastingTestClass1 {

	public static void main(String[] args) {
		
		Object o = new String("Aditya");
		StringBuffer sb = (StringBuffer) o;
		System.out.println(sb);	// java.lang.ClassCastException	
		// String and Stringbuffer has no relations so it throw exception
		
	}

}
