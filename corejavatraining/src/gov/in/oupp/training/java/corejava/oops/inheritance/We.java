/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.inheritance;

/**
 * @author AKG
 *
 */

public class We{
	
	int a,b;
	
	
	public We(int a1, int b1) {
		this.a = a1;
		this.b = b1;
	}



	void show()
	{
		System.out.println("Parent Class: We\n"+a+" "+b);
	}
	
}

class Me extends We {

	int c,d;
	
	public Me(int a, int b, int c1, int d2) {
		// first parent class object will be created then child class object will be created.
		// Thus super will be first line in the scope
		super(a, b);
		this.c = c1;
		this.d = d2;
		// super(a, b); //error
	}



	void display()
	{
		System.out.println("Child Class: Me\n"+c+" "+d);
	}
}
