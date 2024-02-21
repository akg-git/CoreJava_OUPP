/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationForBytes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter File Name: ");
		String fileName = sc.nextLine();
		
		sc.close();
		
		//File PATH
		String filePath = "D:\\OD23KJ158\\OUPPJavaWorkspace\\FileHandlingFolder\\"+fileName+".txt";
		
		//create a file object
		File file = new File(filePath);
		
		try{
			
			//create a new file
			if(file.createNewFile()){
				
				System.out.println("File created successfully at "+file.getAbsolutePath());
				System.out.println("File created successfully at "+file.getCanonicalPath());
			}
			else
				System.out.println("File already exists.");
			
		
			//try-with-resources: here the resources gets automatically closed after completion of program
			
			// write into file using FileOutputStream
			try(FileOutputStream fos = new FileOutputStream(file)){
				//Write data into file if necessary
				String data = "Hello OUPP!!";
				fos.write(data.getBytes());
			}
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		

	}

}
