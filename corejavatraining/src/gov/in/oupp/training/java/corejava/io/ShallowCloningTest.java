/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

/**
 * @author AKG
 *
 */
public class ShallowCloningTest {


	public static void main(String[] args) throws CloneNotSupportedException {
		
		//create original object
		Address realAddress = new Address("Nukkad street", "Chota Town");
		NewStudent realStudent = new NewStudent(6,"Mo Nama", 23, realAddress);
		
		System.out.println("Before clone\nReal Student: \t"+realStudent);
		
		//create clone of the original object
		NewStudent shallowClonedStudent = (NewStudent) realStudent.clone();
		
		//modify the address in the clone: SHALLOW CLONE
		shallowClonedStudent.getAddress().setStreet("Bada Street Highway");
		
		//both original and SHALLOW cloned object are affected
		System.out.println("\n\nAfter Shallow Clone\n");
		System.out.println("Real Student: "+realStudent);
		System.out.println("Shallow Cloned Student: "+shallowClonedStudent);
		
/*		System.out.println("\n\nHash code of realStudent: "+realStudent.hashCode());
		System.out.println("Hash code of shallowClonedStudent: "+shallowClonedStudent.hashCode());
		System.out.println(realStudent.equals(shallowClonedStudent));*/
		
		

	}

}
