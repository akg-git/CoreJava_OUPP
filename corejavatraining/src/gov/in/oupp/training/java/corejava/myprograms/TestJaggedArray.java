/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

import java.util.Scanner;

/**
 * @author AKG
 *
 */
public class TestJaggedArray {

	public static void main(String[] args) {
		
		char []myarr[] = new char[3][];
//		myarr[0] = new char[]{'H','a','p','p','y'};
//		myarr[1] = new char[]{'D','e','e','p','a','v','a','l','i'};
//		myarr[2] = new char[]{'A','l','l',' ','o','f',' ','y','o','u','.'};
		
		myarr[0] = new char[5];
		myarr[1] = new char[9];
		myarr[2] = new char[11];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter characters into the jagged array: ");
		for(int i=0;i<myarr.length;i++){
			for(int j=0;j<myarr[i].length;j++){
				myarr[i][j] = sc.next().charAt(0);
			}
			System.out.println();
		}
		
		
		for(int i=0;i<myarr.length;i++){
			for(int j=0;j<myarr[i].length;j++){
				System.out.print(myarr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
