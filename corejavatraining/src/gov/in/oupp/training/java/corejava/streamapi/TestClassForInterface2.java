package gov.in.oupp.training.java.corejava.streamapi;

/**
 * @author AKG
 *
 */

public class TestClassForInterface2 implements SampleInterface, SampleInterface2  {

	public static void main(String[] args) {
		
		System.out.println("\nWe can access default method (by implementing interface)");
		SampleInterface si = new TestClassForInterface2();
		si.defaultmethod();
		si.dmethod();
		
		System.out.println("\nWe can access staic method (even without implementing interface)");
		SampleInterface.smethod();
		SampleInterface.staticmethod();
		
		System.out.println("\nWe can access default method of SampleInterface2");
		SampleInterface2 si2 = new TestClassForInterface2();
		si2.defaultm();

	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}