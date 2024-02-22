/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops;

import gov.in.oupp.training.java.corejava.oops.interfaces.Ship;

/**
 * @author AKG
 *
 */
public class TestVehicle {

	public static void main(String[] args) {
		
		IVehicle vehicle = new Ship();
//		IVehicle vehicle = new MotorCycle();
		vehicle.accelerator();
		vehicle.brakes();
		vehicle.steering();

	}

}
