/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author Asish Kumar Gouda
 *
 */
public class VectorJavaDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Vector vectorArray = new Vector(5);
		for(int v=0; v < 5; v++){
			vectorArray.addElement(sc.next());
		}
		vectorArray.insertElementAt("odia", 3);
		System.out.println(vectorArray);
		
		sc.close();
	}

}
