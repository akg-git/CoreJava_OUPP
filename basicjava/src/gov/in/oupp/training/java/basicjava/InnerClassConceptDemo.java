/**
 * 
 */
package gov.in.oupp.training.java.basicjava;

/**
 * @authorAKG
 *
 */

class Outer{
	
	private int data=30;
	
	class Inner{
		
		void message(){
			System.out.println("Inside Inner clas: messgage()");
			System.out.println(data);
		}
	}
	
	public void display(){
		System.out.println("Inside outer clas: display()");
	}
	
}

public class InnerClassConceptDemo {


	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.display();
		
		//access Inner class oustide the Outer class
		Outer.Inner inner = outer.new Inner();
		inner.message();

	}

}
