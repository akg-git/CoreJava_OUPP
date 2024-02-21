/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

/**
 * @author AKG
 *
 */
public class Employee extends Person{

	int eid;
	String position;
	
	Employee(){}

	public Employee(int eid, String position) {
		super(102, "Naman");
		this.eid = eid;
		this.position = position;
	}
	
	
	
}
