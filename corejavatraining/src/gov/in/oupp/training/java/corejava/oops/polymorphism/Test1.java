/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.polymorphism;

/**
 * @author AKG
 *
 */

class A{
	int a=10;
	int b=20;
	void show(){
		System.out.println("class A");
	}
}

class B extends A{
	int c=30,d=40;
	void show(){
		System.out.println("class B");
	}
}

public class Test1 {


	public static void main(String[] args) {
		A a1 = new A();		//OK
		B b1 = new B();		//OK
		
		A ab = new B();		// OK: super class can always refer object of sub class
//		B ba = new A();		// Compile Error: sub class can't refer object of super class
		
		a1.show();
		b1.show();
		ab.show();

	}

}
