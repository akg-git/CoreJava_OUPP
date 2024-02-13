/**
 * 
 */
package gov.in.oupp.training.java.basicjava;

/**
 * @author AKG
 *
 */

class A{
	
	public void msg(){
		System.out.println("\"Parent Class: A\"");
	}
}

class B extends A{
	
	public void msg(){
		System.out.println("\"Child Class: B\"");
	}
	
}

class C extends A{
	
	public void msg(){
		System.out.println("\"Child Class: C\"");
	}
	
}

public class RunTimePolymorphismDemo {
	
	public static void main(String[] args) {
		

		
		A ref;
		
		ref= new A();
		ref.msg();
		
		ref = new B();
		ref.msg();
		
		ref = new C();
		ref.msg();
		
		
	}

}
