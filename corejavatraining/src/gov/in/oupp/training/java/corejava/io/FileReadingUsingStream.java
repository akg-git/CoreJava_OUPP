/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class FileReadingUsingStream {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter existing File Name: ");
		String existingFileName = sc.nextLine();

		sc.close();

		// existing file Path
		String exisitngFilePath = "D:\\OD23KJ158\\OUPPJavaWorkspace\\FileHandlingFolder\\" + existingFileName + ".txt";
		
		//create a file object
		File file = new File(exisitngFilePath);
		
		try{
			
			//try-with-resources
			//open FileInputStream for the existing file
			try(FileInputStream fis = new FileInputStream(file)){
				//create a byte array to store the read data
				byte[] data = new byte[(int) file.length()];
				
				//read data from the file into the byte array
				fis.read(data);
				
				//convert the byte array to a string and print it
				String fileContent = new String(data);
				System.out.println("File Content\n-------------------\n"+fileContent);
				
			}
			
		} catch (FileNotFoundException fnfe) {
			
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			
			ioe.printStackTrace();
		}

	}

}
