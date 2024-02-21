/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.Serializable;

/**
 * @author AKG
 *
 */
public class Person implements Serializable{
	
	int pid;
	String name;
	
	public Person(){}
	
	public Person(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	
	

}
