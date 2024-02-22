/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.polymorphism;

/**
 * @author AKG
 *
 */

class AA{
	int a=100;
	public void m1(){
		
	}
	
	public void m2(){
		
	}
	
	public void show(){
		System.out.println(a);
	}
}

class BB extends AA{
	int a=1000;
	public void m3(){
		
	}
	
	public void m4(){
		
	}
	
	//overriden
	public void show(){
		System.out.println(a);
	}
}

public class Test2 {

	public static void main(String[] args) {

		AA b1 = new BB();
		b1.show();
		b1.m1();		//OK
		b1.m2();		//OK
		
		//b1.m3();		//Compile Error
		//b1.m4();		//Compile Error

	}

}
