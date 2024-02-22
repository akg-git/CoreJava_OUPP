/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.associations;

/**
 * @author AKG
 *
 */
public class Student {
	
	int id;
	String name;
	Address address;
	
	
	Student(){
		
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
