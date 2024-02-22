/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops;

/**
 * @author AKG
 *
 */

import gov.in.oupp.training.java.corejava.oops.OuterClass.InnerClass;;

public class InnerOuterTestClass {

	public static void main(String[] args) {
			
		// first create the object of outer class and then inner class
			OuterClass outer = new OuterClass();
			InnerClass inner = outer.new InnerClass();
			
			inner.display();
			
	}

}
