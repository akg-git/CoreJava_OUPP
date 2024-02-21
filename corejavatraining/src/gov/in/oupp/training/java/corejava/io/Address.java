/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

/**
 * @author AKG
 *
 */
public class Address {
	
	String street;
	String city;
	
	//constructors
	public Address(){}
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	
	//getters and setters
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
	

}
