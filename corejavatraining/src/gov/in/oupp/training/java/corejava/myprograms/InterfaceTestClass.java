/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

/**
 * @author Asish Kumar Gouda
 *
 */

interface NewShape{
	void draw();
}

interface Circle extends NewShape{
	void getRadius();
	int radius=10;
}

class NewCircle implements Circle{
	public void getRadius(){
		System.out.println("Circle Radius: "+radius);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceTestClass extends NewCircle{

	public static void main(String[] args) {
	
		Circle nc = new NewCircle();
		nc.getRadius();

	}

}
