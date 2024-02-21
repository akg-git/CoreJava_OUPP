/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author AKG
 *
 */
public class SerializationWRTInheritance {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e1 = new Employee(1047, "Developer");
		System.out.println(e1.pid+"--<pid and eid-->"+e1.eid);
		
		FileOutputStream fos = new FileOutputStream("EmployeeInfo.any");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.flush();	//optional
		
		System.out.println("Deserialization started....");
		FileInputStream fis = new FileInputStream("EmployeeInfo.any");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee) ois.readObject();
		System.out.println(e1.pid+"--<pid and eid-->"+e1.eid);
	}

}
