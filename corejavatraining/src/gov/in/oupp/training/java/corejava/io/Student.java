/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.Serializable;

/**
 * @author AKG
 *
 */
public class Student implements Serializable {

	//transient int id;
	int id;
	String name;

	// constructors
	public Student() {
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
