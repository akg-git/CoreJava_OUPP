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
public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// object creation for Student Class
		Student s1 = new Student(4, "Raman");

		System.out.println("Serialization Started...");

		FileOutputStream fos = new FileOutputStream("RamanStudent.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// write object into a Serializable file
		oos.writeObject(s1);
		//to flush the buffer stream to output device
		oos.flush();
		System.out.println("Serialization Done.");
		
		//closing the output/write stream
		oos.close();

		
		
		System.out.println("Deserialization started...");

		FileInputStream fis = new FileInputStream("Raman.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
	


		// read object from serialized file
		Student s2 = (Student) ois.readObject();
		System.out.println("Student ID: " + s2.getId());
		System.out.println("Student Name: " + s2.getName());

		System.out.println("Deserialization Done.");
		// closing the input/ read stream
		ois.close();

	}

}
