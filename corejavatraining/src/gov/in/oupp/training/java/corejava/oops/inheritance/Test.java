/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.inheritance;

/**
 * @author AKG
 *
 */


class A{
	int a,b;
	
	A(){}
	
	A(int a, int b)
	{
		this.a = a;
		this.b = b;
		
	}
	
	void show()
	{
		System.out.println("a = "+a+"\tb = "+b);
	}
}

class B extends A{

}


public class Test {


	public static void main(String[] args) {
		

		A a1 = new A();
		B b1 = new B();
		
		b1.show();
		
		A b2 = new A(10,20);
		b2.show();


	}

}

