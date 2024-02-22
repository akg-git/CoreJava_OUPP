/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops;

/**
 * @author AKG
 *
 */

//OUTER CLASS
public class OuterClass {
	private int a=10;
	private void show()
	{
		System.out.println(a);
		
		//System.out.println(b);	//inner class member variable
		
		//display();	//inner class method
	}
	
	// INNER CLASS	
	class InnerClass{
		int b=100;
		
		public void display(){
			System.out.println("Inner Class method:\t");
			System.out.println(b);
			System.out.println("outer class variable: "+a);
			//outer class method
			show();
		}
	}
		
}
