/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

/**
 * @author USER-108
 *
 */
public class DeepCloningTest {
	
	public static void main(String[] args) {
		
		//create original object
		Address realAddress = new Address("Old street", "Old Town");
		NewStudent realStudent = new NewStudent(16,"Nija Nama", 25, realAddress);
		
		//print before cloning
		System.out.println("Before Deep Cloning,");
		System.out.println("Original City: "+realStudent);
		
		//get student details
		NewStudent deepClonedStudent = new NewStudent(
				realStudent.getId(),
				realStudent.getName(),
				realStudent.getAge(),
				new Address(realStudent.getAddress().getStreet(),
							realStudent.getAddress().getCity()	
				));
	
		//modify the city address using DEEP CLONE
		deepClonedStudent.getAddress().setCity("New Smart City");
		
		//original object and cloned object are independent, thus original object is not affected.
		System.out.println("\nAfter Deep Cloning,");
		System.out.println("Original City: "+realStudent);
		System.out.println("Deep Cloned Student: "+deepClonedStudent);
		
		
	/*	System.out.println("\n\nHash code of realStudent: "+realStudent.hashCode());
		System.out.println("Hash code of shallowClonedStudent: "+deepClonedStudent.hashCode());
		System.out.println(realStudent.equals(deepClonedStudent));*/
		
	}

}
