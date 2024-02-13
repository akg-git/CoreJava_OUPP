/**
 * 
 */
package gov.in.oupp.training.java.string;

/**
 * @author Asish Kumar Gouda
 *
 */
public class Comparision {


	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "helLo";
		
		String s3 = new String("Hello");
		
		System.out.println("s1 and s2");
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.compareTo(s2)); // ascii(s1) - ascii(s2)
		System.out.println(s2.compareTo(s1)); // ascii(s2) - ascii(s1)
		
		System.out.println("s1 and s3");
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1.compareTo(s3)); // ascii(s1) - ascii(s3)		
		
	}

}
