/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Asish Kumar Gouda
 *
 */
public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(2, null);
		hmap.put(-3, "Batchmate");
		hmap.put(2, "Vinayak");
		//hmap.put(null, 7);
		hmap.put(6, null);
		
		System.out.println("Notebook List\n-------------------");
		for(Map.Entry me: hmap.entrySet()){
			System.out.println(me.getKey()+ " " + me.getValue());
		}
		
		System.out.println("Size = "+hmap.size());
		System.out.println("Values: "+hmap.values());
		System.out.println("Keys: "+hmap.keySet());
		
		//hmap.clear();
		
		System.out.println("\n\nNotebook List\n-------------------");
		for(Map.Entry me: hmap.entrySet()){
			System.out.println(me.getKey()+ " " + me.getValue());
		}
		
		System.out.println(hmap.getClass());

	}

}
