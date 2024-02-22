/**
 * Test Associations Class
 */
package gov.in.oupp.training.java.corejava.oops.associations;

/**
 * @author AKG
 *
 */
public class TestAggregation {

	public static void main(String[] args) {
		
		Address address = new Address();
		
		address.setCity("Keonjhar");
		address.setState("Odisha");
		address.setCountry("India");
		
		Student student = new Student();
		student.setId(6);
		student.setName("Student Name");
		student.setAddress(address);
		
		System.out.println(student);
		
		
		// AGGREGATION: If the container object Student doesn't exist but contained object Address still exists
		student = null;
		System.out.println("After student is null.");
		System.out.println(student);
		System.out.println(address);
		
//		address = null;
//		System.out.println("After address is null.");
//		System.out.println(address);
//		System.out.println(student);

	}

	@Override
	public String toString() {
		return "TestAssociations [toString()=" + super.toString() + "]";
	}

}
