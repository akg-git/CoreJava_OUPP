/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.inheritance;

/**
 * @author AKG
 *
 */

class AA{
	int a,b;
	
//	AA(int a, int b)
//	{
//		this.a = a;
//		this.b = b;
//		
//	}
	
	void show()
	{
		System.out.println("a = "+a+"\tb = "+b);
	}
}

class BB extends AA{
	int c,d;
	
	BB(int c, int d)
	{
		this.c = c;
		this.d = d;
		
	}
	
	void display()
	{
		System.out.println("c = "+c+"\td = "+d);
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		AA a1 = new AA();
		BB b1 = new BB(10,20);
		
		b1.show();

	}

}
