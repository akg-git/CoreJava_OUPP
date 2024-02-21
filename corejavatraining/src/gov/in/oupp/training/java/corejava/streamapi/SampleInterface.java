package gov.in.oupp.training.java.corejava.streamapi;

/**
 * @author AKG
 *
 */

public interface SampleInterface {

	public static final float PI = 3.14f;
	float PIE = 3.14159f;

	public void m1();

	public void m2();

	static void smethod() {
		System.out.println("static method: smethod() || inside SampleInterface");
	}

	default void dmethod() {
		System.out.println("default method: dmethod() || inside SampleInterface");
	}		// no need of override in every method

	static void staticmethod() {

		System.out.println("static method: staticmethod() || inside SampleInterface");
	}

	default void defaultmethod() {
		
		System.out.println("default method: defaultmethod() || inside SampleInterface");
	}

}
