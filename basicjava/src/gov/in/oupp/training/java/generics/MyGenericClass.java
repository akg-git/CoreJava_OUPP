/**
 * 
 */
package gov.in.oupp.training.java.generics;

/**
 * @author Asish Kumar Gouda
 *
 */
public class MyGenericClass {
	
	public static <E> void printArray(E[] elements)
	{
		for(E ele: elements){
			System.out.println(ele);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40,50};
		Character[] charArray = {'O','U','P','P'};
		
		System.out.println("Print Arrays\n----------------");
		printArray(intArray);
		printArray(charArray);
		
	}
	
	

}
