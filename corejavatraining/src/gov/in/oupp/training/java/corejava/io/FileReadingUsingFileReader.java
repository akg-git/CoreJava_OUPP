/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class FileReadingUsingFileReader {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter existing File Name: ");
		String existingFileName = sc.nextLine();

		sc.close();

		// existing file Path
		String exisitngFilePath = "D:\\OD23KJ158\\OUPPJavaWorkspace\\FileHandlingFolder\\" + existingFileName + ".txt";

		// creating file object
		File existingFile = new File(exisitngFilePath);

		try {
			// try-with-resources
			// open FileReader and wrap it with BufferedReader for efficient
			try (BufferedReader breader = new BufferedReader(new FileReader(existingFile))) {
				// read data - line by line
				String line;
				while ((line = breader.readLine()) != null) {
					System.out.println(line);
				}
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
