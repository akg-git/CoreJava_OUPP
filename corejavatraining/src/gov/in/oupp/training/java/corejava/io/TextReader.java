/**
 * 
 */
package gov.in.oupp.training.java.corejava.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class TextReader {

	public static void main(String[] args) {

		File file = new File("D:\\OD23KJ158\\OUPPJavaWorkspace\\FileHandlingFolder\\SampleFile2.txt");
		
		try{
			//create scanner object
			Scanner filescan = new Scanner(file);
			
			//write into file and 
			//display in console
			while(filescan.hasNextLine()){
				String line = filescan.nextLine();
				System.out.println(line);
			}
			
			//close scanner
			filescan.close();
			
		}catch(FileNotFoundException fnfe){
			System.out.println("File not found exception: "+fnfe);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}

	}

}
