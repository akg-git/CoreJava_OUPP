/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class CreateNewTextFile {
	
	public void updateFile(String fileName, String PATH){
		
	}
	
	public void createNewFile(String fileName){
		
		String PATH = "D:\\OD23KJ158\\OUPPJavaWorkspace\\FileHandlingFolder"+fileName+".txt";
		File file = new File(PATH);
		try {
			
			boolean isFileCreated = file.createNewFile();
			if(isFileCreated){
				System.out.println(fileName+" file is created successfully.");
				
				updateFile( fileName,  PATH);
				
			}else{
				System.out.println(fileName+" file is unable to create.");
			}
			
			
		} catch (IOException ioe) {
			
			ioe.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String fileName;
		System.out.print("Enter File Name: ");
		fileName = scan.nextLine();
		
		CreateNewTextFile cntf = new CreateNewTextFile();
		cntf.createNewFile(fileName);
		
		scan.close();

	}

}
