/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class FileWritingUsingExistingFile {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter existing File Name: ");
		String existingFileName = sc.nextLine();
		
		sc.close();
		
		//exisitng file Path
		String exisitngFilePath = "D:\\OD23KJ158\\OUPPJavaWorkspace\\FileHandlingFolder\\"+existingFileName+".txt";
		
		//creating file object
		File file = new File(exisitngFilePath);
		
		try{
			
			//try-with-resources: append is true(enabled)
			try(FileOutputStream fos = new FileOutputStream(file, true)){
				
				//data to be append
				String data = "Writing data into exisitng file.(2nd time) -- append";
				
				//convert string to bytes and append
				fos.write(data.getBytes());
				
				System.out.println("Data appended to the file: "+existingFileName+" at the location "+file.getAbsolutePath());
			}
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

}
