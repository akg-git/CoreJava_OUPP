/**
 * Method Overriding
 */
package gov.in.oupp.training.java.corejava.myprograms;

/**
 * @author AKG
 *
 */


class SuperClass{
	SuperClass(){
		
	}
	
	protected int display(int v){
		System.out.println("Super class values");
		System.out.println("value="+ v);
		return 1;
	}
	
	public void show(int x, float y){
		System.out.println("Super class values");
		System.out.println("x="+ x+ " y= "+y);
	}
}

class SubClass extends SuperClass{
	SubClass(){
		
	}
	
	// visibility of method should be atleast package level in order to override method
	protected int display(int v){
		System.out.println("Sub class values");
		System.out.println("value="+ v);
		return 1;
	}
	
	public void show(int x, float y){
		System.out.println("Sub class values");
		System.out.println("x="+ x+ " y= "+y);
	}
}

public class PolyMor2 {

	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		sub.display(5);
		
	}

}
