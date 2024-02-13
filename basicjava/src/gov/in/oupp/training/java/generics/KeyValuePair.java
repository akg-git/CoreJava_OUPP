/**
 * 
 */
package gov.in.oupp.training.java.generics;

/**
 * @author Asish Kumar Gouda
 *
 */

interface Pair<K,V>
{
	public K getKey();
	public V getValue();
}

class OrderedPair<K,V> implements Pair<K,V>
{
	private K key;
	private V value;
	
	public OrderedPair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey(){
		return key;
	}
	
	public V getValue(){
		return value;
	}
}


public class KeyValuePair {
	
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("LowestDoubleDigit", 10);
		Pair<String, Double> p2 = new OrderedPair<String, Double>("PI", 3.14);
		
		System.out.println(p1.getKey()+":"+p1.getValue());
		System.out.println(p2.getKey()+":"+p2.getValue());
	}

}
