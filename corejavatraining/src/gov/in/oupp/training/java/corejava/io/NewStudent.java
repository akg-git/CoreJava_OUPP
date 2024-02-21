
package gov.in.oupp.training.java.corejava.io;

/**
 * @author AKG
 *
 */
public class NewStudent implements Cloneable {

	int id;
	String name;
	int age;
	Address address;

	// constructors
	public NewStudent() {
	}

	public NewStudent(int id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}

	@Override
	public String toString() {
		return "NewStudent [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	

}
