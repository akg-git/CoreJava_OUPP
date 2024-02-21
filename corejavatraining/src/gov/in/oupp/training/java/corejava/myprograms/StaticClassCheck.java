/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

/**
 * @author Asish Kumar Gouda
 *
 */

//public static class StaticClassCheck {
public class StaticClassCheck {
	
	int x=10;
	int y=24;
	
	public void show(){
		System.out.println(x+" "+y);
	}

}

class NewClass extends StaticClassCheck{
	static int z=0;
	void display(){
		int z=0;
		System.out.println(super.x+" "+super.y+" "+z);
	}
}
