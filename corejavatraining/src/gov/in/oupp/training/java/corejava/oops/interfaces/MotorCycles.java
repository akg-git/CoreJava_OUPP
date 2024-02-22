/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.interfaces;

import gov.in.oupp.training.java.corejava.oops.IVehicle;

/**
 * @author AKG
 *
 */

public class MotorCycles  implements IVehicle{
	
	@Override
	public void steering()
	{
		System.out.println("Normal Steering");
	}
	
	@Override
	public void brakes(){
		System.out.println("Normal Brakes");
	}
	
	@Override
	public void accelerator(){
		System.out.println("Normal Accelerator");
	}

}
