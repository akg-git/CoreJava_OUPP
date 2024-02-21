/**
 * Method Overloading
 */
package gov.in.oupp.training.java.corejava.myprograms;

/**
 * @author AKG
 *
 */

class Parent{
	Parent(){
		
	}
	
	public void display(int v){
		System.out.println("Parent class values");
		System.out.println("value="+ v);
	}
	
	public void show(int x, float y){
		System.out.println("Parent class values");
		System.out.println("x="+ x+ " y= "+y);
	}
}

class Child extends Parent{
	Child(){
		
	}
	
	public void display(float v){
		System.out.println("Child class values");
		System.out.println("value="+ v);
	}
	
	public void show(float x, int y){
		System.out.println("Child class values");
		System.out.println("x="+ x+ " y= "+y);
	}
}


public class PolyMor1{
	
public static void main(String args[]){
		Child c1 = new Child();
		c1.show(10,20.5f);
		c1.show(10.2f, 20);
		
		Parent p1 = new Child();
		p1.show(110, 20.2f);
	//	p1.show(20.2f, 10);
		
		c1.display('A');
	//	c1.display(10.4);
		
		p1.display('A');
		
	}
	
}


