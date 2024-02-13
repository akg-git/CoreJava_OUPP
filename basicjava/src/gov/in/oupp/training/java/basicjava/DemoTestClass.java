/**
 * 
 */
package gov.in.oupp.training.java.basicjava;

/**
 * @author AKG
 *
 */
 class ABC {
	
	{
		System.out.println("Non-Static Block");
	}
	
	static{
		System.out.println("sTATIC bLOCK");
	}
	
	ABC(){
		System.out.println("Default Constructor");
	}

}


public class DemoTestClass{
	
	
	
	public static void main(String[] args) {
		
		ABC ob1 = new ABC();
		ABC ob2 = new ABC();
		ABC ob3 ;			//reference is declared but object is not created
		
		System.out.println("\nConclusion:");
		System.out.println("Static Block will execute first || it will execute ONCE in a program.\n");
		System.out.println("Non-Static Block will execute second ||  it will be called EACH TIME a object is created");
		System.out.println("Constructor will execute at last || it will be called EACH TIME a object is created");
		
	}
}