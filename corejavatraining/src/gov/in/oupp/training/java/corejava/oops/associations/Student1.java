/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.associations;

/**
 * @author AKG
 *
 */
public class Student1 {
	

	int id;
	String name;
	Address1 address1;
	
	
	Student1(){
		address1 = new Address1();
	}
	
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
	
	
	

	public Address1 getAddress1() {
		return address1;
	}

	public void setAddress1(Address1 address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address1 + "]";
	}
	

}
