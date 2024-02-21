/**
 * 
 */
package gov.in.oupp.training.java.corejava.hash;

import java.util.HashMap;

/**
 * @author AKG
 *
 */


class Customer{
	
	int id;
	String name;
	
	//default constructor
	public Customer(){}
	
	// parameterized constructor
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//override hashcode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//override equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
}

public class EqualsAndHashCodeTest {
	
	public static void main(String[] args) {
		
		Customer customer1  = new Customer(100,"Jay");
		Customer customer2  = new Customer(100,"Jay");
		
		
		HashMap<Customer, String> hashMap = new HashMap<>();
		hashMap.put(customer1, "customer1");
		String result = hashMap.get(customer2);
		System.out.println(result);
//		hashMap.put(customer2, "customer2");
//		result = hashMap.get(customer2);
//		System.out.println(result);
		
		
		
	}
	

}
