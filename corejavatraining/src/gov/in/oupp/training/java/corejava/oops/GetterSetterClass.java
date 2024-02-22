/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops;

/**
 * @author AKG
 *
 */
public class GetterSetterClass {
	
	int customer_id;
	String name;
	short age;
	
	//default constructor
	public GetterSetterClass()
	{
		
	}
	
	//getters and setters
	
	/**
	 * @return the customer_id
	 */
	public int getCustomer_id() {
		return customer_id;
	}



	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the age
	 */
	public short getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(short age) {
		this.age = age;
	}



	public static void main(String[] args) {
		
		GetterSetterClass c1 = new GetterSetterClass();
		c1.setCustomer_id(101);
		c1.setName("Ajay");
		c1.setAge((short)23);
		
		System.out.println("Customer Data: "+c1.getCustomer_id()+" "+c1.getName()+" "+c1.getAge());
	}

}
