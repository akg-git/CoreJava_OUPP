/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.inheritance;

/**
 * @author AKG
 *
 */
public class PP {
	int a,b;
	
	PP()
	{
		// default constructor calling parameterized constructor
		this(20, 30);
	}
	
	PP(int a, int b)
	{
		//without using this keyword scope of variable remains local
		a = a;
		this.b = b;
		System.out.println(a+b);
		System.out.println(a);
	}
	
	

// using getters and setters
	
//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//
//	public int getB() {
//		return b;
//	}
//
//	public void setB(int b) {
//		this.b = b;
//	}

	public static void main(String[] args) {
		
		PP p  = new PP();
		System.out.println("a = "+p.a);
	}

}
