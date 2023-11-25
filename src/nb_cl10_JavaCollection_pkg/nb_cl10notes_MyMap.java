
///// JAVA Class 10 part 2.a: on May 27, 2023, Saturday with Instructor AP ////


package nb_cl10_JavaCollection_pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class nb_cl10notes_MyMap {

	
	// Map Concept: HashMap, LinkedHashMap, TreeMap
		// Map<key, Value> ObjectName = new HashMap <Key, Value> ();
		
		// Divided into three types:
			// 1. HashMap will just show in random order...abdx or bxad or xbda, etc.... but if duplication, it sticks back with the first/old value instead of new 
			// 2. linkedHashMap will put just like how you inserted as it follows insertion order... if duplication, it updates/changes to the new value from the first/old value
			// 3. TreeMap will put this in either alphabetical or ascending order.. like abdx.....Like LinkedHashMap, if duplication, it updates/changes to the new value from the first/old value
		
		// duplication key is not allowed, but duplication value is allowed like explained below. 
			// key will have only 1 value.. even if duplication is done, it takes its new value after the change...cant have 2 values for the same key
			// key1 and key1 cannot have different values...k1 = 10, k1 = 20 -- not allowed
			// key1 and key 2 can have same values...k1 = 10, k2 = 10 -- allowed
			// bank account number would be an example of keys since account number cannot be duplicated
			// bank account type would be an example of values since this can be duplicated like multiple saving/checking accounts
			// sorting happens in regards to the keys, not the values
	
	
		// IQA 1: Can my keys be another collection like ArrayList when you are using Map? meaning collection inside collection
			// --> Yes, you can play with it. For example, the key can be Integer[], and value be Integer...or Character[], Character...or Array[], Integer, etc. 	
	
	
	
	
	// ============== ================= ================== ==================
	
	
// Exercise 1: 	
	public static void main(String[] args) {
		
		
		
		// Map<key, Value< ObjectName = new HashMap <Key, Value> ();
		Map <Character, Integer> map = new TreeMap <Character, Integer> ();
		
//		Map <Integer[], Integer> map = new TreeMap <Integer[], Integer> ();
//		Map <Character[], Integer> map = new TreeMap <Character[], Integer> ();
//		Map <Character[], Integer> map = new TreeMap <Character[], Integer> ();	
			// array inside is possible as long as you define it. 
		
		Integer[] abc = {1,2,3,4};  // WHAT AM I TRYING TO DOOOO???
		Character[] xyz = {1,2,3};
//		map.put(abc, 100);
		
		map.put('a', 99);
		map.put('b', 88);
		map.put('d', 77);
		map.put('x', 66);
		map.put('a', 55);
//		map.put(key, value);
		
		System.out.println(map.get('a'));
		System.out.println(map.get('c'));
		
// IDK		System.out.println(map.put(xyz, 100);
		System.out.println(map);
		
		System.out.println(map.keySet());  // will print all the keys only in a vertical line
		System.out.println(map.values()); // will print all the values only in a horizontal line
	
		for(Integer item : map.values()) {
			System.out.println(map.keySet());  // will print all the keys vertically
			System.out.println(map.values());  // will print all the values in different lines vertically
			System.out.println(item);   // will print all the values in different lines vertically
		}		
	}
}
