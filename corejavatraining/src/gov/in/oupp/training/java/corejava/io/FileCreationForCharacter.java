/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class FileCreationForCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter File Name: ");
		String fileName = sc.nextLine();
		
		sc.close();
		
		//File Path
		String filePath = "D:\\OD23KJ158\\OUPPJavaWorkspace\\FileHandlingFolder\\"+fileName+".txt";
		
		//create a file object
		File file = new File(filePath);
		
		try {
			//create a new file
			if(file.createNewFile()){
				System.out.println(fileName+" file created at "+file.getAbsolutePath());
			}else{
				System.out.println(fileName+" file already exists.");
			}
			
			//write into file using FileWriter
			try(FileWriter fwriter = new FileWriter(file)){
				//write data into file (if necessary)
				
				String myData = "File Write using Character Stream";
				fwriter.write(myData);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
