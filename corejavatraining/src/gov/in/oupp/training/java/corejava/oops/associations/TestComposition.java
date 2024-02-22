/**
 * 
 */
package gov.in.oupp.training.java.corejava.oops.associations;

/**
 * @author AKG
 *
 */


public class TestComposition {

	public static void main(String[] args) {
		
			Address1 a1 = new Address1();
			Student1 s1 = new Student1();
			
			s1.setId(10);
			s1.setName("Rahim");
			
			s1.getAddress1().setCity("Baripada");
			s1.getAddress1().setState("Odisha");
			s1.getAddress1().setCountry("India");
			
			System.out.println(s1);
			
			// Composition: If the container object Student doesn't exist but contained object Address also doesn't exists
			s1 = null;
			
			System.out.println(s1);
			System.out.println(a1);
			
			
	}

}
