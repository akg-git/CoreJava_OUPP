/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.interfaces;

import gov.in.oupp.training.java.corejava.oops.IVehicle;

/**
 * @author AKG
 *
 */
public class Ship  implements IVehicle{
	
	@Override
	public void steering()
	{
		System.out.println("Power Steering");
	}
	
	@Override
	public void brakes(){
		System.out.println("Disc Brakes");
	}
	
	@Override
	public void accelerator(){
		System.out.println("Incremental Accelerator");
	}

}

class LMS extends Ship{
	
}