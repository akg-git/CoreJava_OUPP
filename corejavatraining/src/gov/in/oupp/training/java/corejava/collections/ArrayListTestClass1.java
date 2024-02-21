/**
 * 
 */
package gov.in.oupp.training.java.corejava.collections;

import java.util.ArrayList;

/**
 * @author AKG
 *
 */
public class ArrayListTestClass1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = new ArrayList<>();
		
		for(int i=0; i<100; i+=10){
			integerList.add(i);
		}
		System.out.println(integerList);
		
		System.out.println("After some addition and deletion");
		integerList.add(67);		//insert
		integerList.add(2, 25);		//replace
		integerList.set(5, 48);		//replace 
		integerList.remove(4);
		System.out.println(integerList);
		
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(146);
		ilist.add(536);
		ilist.add(276);
		System.out.println("Another List: ");
		System.out.println(ilist);
		
		if(ilist.contains(276)){
			System.out.println(276+" exists.");
		}
		else{
			System.out.println(276+" not exist.");
		}

//		by default it add the new list(collection) at the end.
//		integerList.addAll(ilist);
//		System.out.println(integerList);
		
		System.out.println("After adding Another List: ");
		integerList.addAll(3,ilist);
		System.out.println(integerList);
		
		
		

		System.out.println("After removing Another List: ");
		integerList.removeAll(ilist);
		System.out.println(integerList);
		
		
		
		
		
		
		

	}

}
