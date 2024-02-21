/**
 * 
 */
package gov.in.oupp.training.java.corejava.annotations;

import java.util.ArrayList;

/**
 * @author AKG
 *
 */


class A {
	
	@Deprecated
	void show(){
		System.out.println("I am in Super Class.");
	}
	
}

class B extends A{
	
	@Override
	void show(){
		System.out.println("I am in Sub Class.");
	}
}

public class TestOverride {

	public static void main(String[] args) {
		
		@SuppressWarnings({ "rawtypes", "unused" })
		ArrayList al = new ArrayList();
		B a1 = new B();
		a1.show();
		
	}

}
