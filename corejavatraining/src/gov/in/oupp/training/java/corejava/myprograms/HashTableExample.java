/**
 * 
 */
package gov.in.oupp.training.java.corejava.myprograms;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Asish Kumar Gouda
 *
 */
public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Sun", "Sunday");
		ht.put("Mon", "MOday");
		ht.put("Tue", "Tuesday");
		ht.put("Wed", "Wednesday");
		ht.put("Thu", "Thursday");
		ht.put("Fri", "Friday");
		ht.put("Sat", "Saturday");
		//ht.put(null, "NullDay");	//NullPointerException
		//ht.put("MyDay", null);	//NullPointerException
		
		System.out.println("Weekdays List\n-------------------");
		for(Map.Entry me: ht.entrySet()){
			System.out.println(me.getKey()+ " " + me.getValue());
		}

	}

}
