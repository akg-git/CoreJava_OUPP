package gov.in.oupp.training.java.corejava.streamapi;

/**
 * @author AKG
 *
 */

public class TestClassForInterface3  implements  SampleInterface2{

	public static void main(String[] args) {

		System.out.println("\nWe can access default method of SampleInterface2");
		SampleInterface2 si3 = new TestClassForInterface3();
		si3.defaultm();

	}

}
