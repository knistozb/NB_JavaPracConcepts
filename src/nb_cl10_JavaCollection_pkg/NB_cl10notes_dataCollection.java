
///// JAVA Class 10 part 1.a: on May 27, 2023, Saturday with Instructor AP ////


package nb_cl10_JavaCollection_pkg;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NB_cl10notes_dataCollection {

	
	
	// array : we have multiple values saved in one variable separated by commas
		// while identifying the individual value, it works using indexes i.e 0,1,2,3.....
	
	// IQA 1: What is the limitation of array in Java?
		// the limitation is the array is static (fixed) when it comes to the size meaning during the run time if you want to change the size of an array, it won't work. Once you define the size, that's the size. 
		// in the runtime if you tried increasing the size, then we will end up losing all our data that we had prior to attempting to change the size since it dumps them all out. 
		// Only during the coding time, it is okay to make changes without losing any data. 
		// the size is fixed during the initialization. If you need to increase the size then you will need to re-initialize
		// But it is okay if you decrease the size then it will print till that decreased size. 
		// Also it is okay if you replace an old student with a new student as long we don't increase the size/space
	
	// IQA 2: What is the best practice to use array?	
		// It is better if used when we know the value is fixed, and does not change later. Once you define the size, that's the size.
	

	// Java Collection Types:
		// 1. list: ArrayList, LinkedList ==> it is dynamic because you don't have to give certain number and keep adding as you need
				// allows duplication, and other methods like get, add, remove, etc. 
		
		// 2. Set: HashSet, LinkedHashSet, TreeSet
				// Set<String> col = new HashSet<String> ();
				// the common factor between all of them is they don't allow duplication of values, and prohibits certain methods like get, remove, etc. 
						// if it involves using index number... you have to be specific by putting actual values if you want to remove them.
				// the big difference is them working in different orders... because of ordering reason, the index numbers cannot be used.
					// i. HashSet: it works in random order
							// this one is the fastest among these 3 since it uses random order
					// ii. LinkedHashSet : Insertion Order... how we insert/add, it will come/add/insert just like that
					// iii. TreeSet: when dealing with String, it works alphabetical order
							// when dealing with numbers, it works ascending order
							// the slowest among these 3 since it has little complicated ordering
		
		// 3. Map: HashMap, LinkedHashMap, TreeMap
			// Map<key, Value< ObjectName = new HashMap <Key, Value> ();
			// Divided into three types:
				// 1. HashMap will just show in random order...abdx or bxad or xbda, etc.... but if duplication, it sticks back with the first/old value instead of new 
				// 2. linkedHashMap will put just like how you inserted as it follows insertion order... if duplication, it updates/changes to the new value from the first/old value
				// 3. TreeMap will put this in either alphabetical or ascending order.. like abdx.....Like LinkedHashMap, if duplication, it updates/changes to the new value from the first/old value
			 
	
	
	// formula to declare a variable:
		// dataType variableName = value;
		// dataType[] arrayName = new dataType[size];
	
	// Collection<ObjectDataType> variableName = new CollectionType <ObjectDataType>();
	
	
	// IQA 3: Do you know about list in java? Have you used it? if so how? What are the methods you used?
			// You must say YES, I KNOW WHAT THAT IS AND HAVE USED IT BEFORE. There are several like add method where you add values, get method where you retrieve values, remove method where you delete values, size method where you count the number of values, etc... 
		
		// IQA 4: What is the difference between ArrayList and LinkedList?
			// as for the work done by method goes, there is no difference at all. But difference are how those 2 were designed in terms of software architect, whoever designed it. 
			// Let's say in DMV office there usually is a long line, and as the first person leaves, there usually is a sound of people shuffling and moving up a spot based on the indexes. 	
				// ArrayList concept: when they don't know who is next while moving up and if they have to depend till someone ahead moves up, that could be a problem.. This is ArrrayList where there is a line queue. 
				// Vs LinkedList concept: in doctor's office, they are given some number token so everybody sits and only those being called moves. other are just relaxed sitting and waiting. This is more effective and faster because they have a number so they know who is before and after them. 
				// In ArrayList, the item are placed in a line so once somebody leaves from the line ahead of you then every data behind that data has to move up. It takes few seconds and for computer while computing thousands of data, it will add up to a longer wait time which could be vital for us. 
				// LinkedList: it only worries about who I am linked to before me and next to me. Also called "node concept"  that says the data are linked to one other meaning before (previous node) and after (next node) in a chain. The array will automatically adjust where everybody shuffles so the time to process is faster . 
		
		// IQA 5: In your daily chores, which one you use the most?
			// ArrayList because we don/t work with thousands or millions of data so such milliseconds or nanoseconds are not a big deal to us. Unlike developers who might have to work with huge data, it may add up to become long time so they could use the LinkedList.   
		
		// IQA 6: Why do we need these collections?
			// we need this to deal with the limitation java has on the array. Since this is dynamic, we can worry less and be able to modify (add, remove, change) values as per our need without limiting ourselves with a fixed size just like in array
		
		// IQAA 7: Why list and set then?
			// I want to worry about where I spend my money rather than just the transaction. With set, you can just collect the totals of similar transaction of the same store like apple only, walmart only, etc. at one place rather than having every single one for each. 
			// List, since doesn't worry about duplication, even if the same store is repeated, it collects all of them separately. 
			// VS set will categorize for each stores, and only record the transactions for that store in 1 place, and others in other's separate place, and so on. 
		
		

	
	
	// ============= ================ ================= ================= ================ =================
	
	
// Exercise 5: 	Using HashSet
	public static void main(String[] args) {
			
//		TreeMap<String> col = new TreeMap<String> ();
//		LinkedHashMap<String> col = new LinkedHashMap<String> ();
		Set<String> col = new HashSet<String> ();
//NK		Set<ArrayList<String>> col = new HashSet<ArrayList<String>> ();
			// you can have an list inside another list as long as you import them. 
		
		System.out.println(col.add("jane"));  // this will print true because it only cares about was this code successful in adding Jane or whatever and since it did, the return type is boolean , true. 
		col.add("tom");
		col.add("steve");
		System.out.println(col.add("tom"));  // duplication is not accepted in hashset, LinkedHashSet, TreeSet
					
				
//		System.out.println(col.indexOf("jane"));  // 0 as it will print the index place of that value...if duplicates then it prints the first one
				
		System.out.println(col);   
		System.out.println(col.size());  
		
		col.add("James");
		System.out.println(col);  
		System.out.println(col.size());  
//		System.out.println(col.get(0));  
				
//		col.remove(1);  // this wont print, but remove it....list moves up to replace the removed seat, and the very last seat gets deleted
		System.out.println(col);   
//		System.out.println(col.get(0));  
		System.out.println(col.size());  
					
		for (String item : col) {
			System.out.println(item);
		}	
		
		Object[] myArray = col.toArray();
			// you have to convert your values into an array by creating an object to be able to use the index numbers 
		System.out.println(myArray[0]);
//		System.out.println(myArray[1]);
	}
}	
	
	
 	/*
// Exercise 5: 	Using HashSet

	public static void main(String[] args) {
		
		TreeSet<String> col = new TreeSet<String> ();
//		LinkedHashSet<String> col = new LinkedHashSet<String> ();
//		Set<String> col = new HashSet<String> ();
				
//			col.add("jane");
			System.out.println(col.add("jane"));  // this will print true because it only cares about was this code successful in adding Jane or whatever and since it did, the return type is boolean , true. 
			col.add("tom");
			col.add("steve");
			System.out.println(col.add("tom"));  // duplication is not accepted in hashset, LinkedHashSet, TreeSet
				
			
//			System.out.println(col.indexOf("jane"));  // 0 as it will print the index place of that value...if duplicates then it prints the first one
			
			System.out.println(col);   
			System.out.println(col.size());  
			
			col.add("James");
			System.out.println(col);  
			System.out.println(col.size());  
//			System.out.println(col.get(0));  
			
//			col.remove(1);  // this wont print, but remove it....list moves up to replace the removed seat, and the very last seat gets deleted
			System.out.println(col);   
//			System.out.println(col.get(0));  
			System.out.println(col.size());  
			
			for (String item : col) {
				System.out.println(item);
			}
	}
}
	*/
	
	/*
// Exercise 4: 	Using linkedList

	public static void main(String[] args) {
		
		List<String> col = new LinkedList<String> ();
//		LinkedList<String> col = new LinkedList<String> ();  // you can start off with ArrayList or LinkedList depending on what you need instead of just list for collection type
//		List<String> col = new LinkedList<String> ();  // same as below
//		List<String> col = new LinkedList<> ();  // same as above as removing String on second time is okay

		col.add("jane");
//		System.out.println(col.add("jane"));  // this will print true because it only cares about was this code successful in adding Jane or whatever and since it did, the return type is boolean , true. 
		col.add("tom");
		col.add("steve");
		col.add("jane");  // duplication is not a problem as it will add the duplicates normally			
	
		System.out.println(col.indexOf("jane"));  // 0 as it will print the index place of that value...if duplicates then it prints the first one
		
		System.out.println(col);   // [jane, tom, james]
		System.out.println(col.size());  // 3
		col.add("James");
		System.out.println(col);  // [jane, tom, steve, james]
		System.out.println(col.get(0));  // jane
//		System.out.println(col.remove(0)); // it will remove but still show Jane in the print
		col.remove(1);  // this wont print, but remove it....list moves up to replace the removed seat, and the very last seat gets deleted
		System.out.println(col);   // [tom, steve, james]
		System.out.println(col.get(0));  // ans is tom....if the previous one is removed, this one moves up to take that empty spot
		System.out.println(col.size());  // 3
			
		for (String item : col) {
			System.out.println(item);
		}			
	}
}
	*/	
	
	/*
// Exercise 3: 	Using ArrayList

	public static void main(String[] args) {
	
		List<String> col = new ArrayList<String> ();

		col.add("jane");
		col.add("tom");
		col.add("steve");
		
		System.out.println(col);   // [jane, tom, james]
		System.out.println("========1==========");
		System.out.println(col.size());  // 3
		col.add("James");
		System.out.println(col);  // [jane, tom, steve, james]
		System.out.println("========2==========");
		System.out.println(col.get(0));  // jane
		System.out.println("========3==========");
//		System.out.println(col.remove(0)); // it will remove but still show Jane in the print
		col.remove(1);  // this wont print, but remove it like tom in this case....list moves up to replace the removed seat, and the very last seat gets deleted
		System.out.println(col);   // [jane, steve, james]
		System.out.println("========4==========");
		System.out.println(col.get(1));  // ans is steve....if the previous one is removed, this one moves up to take that empty spot
		System.out.println(col.size());  // 3... since remaining ones are jane, steve, and james as tom got removed earlier
		
		// Using for each loop to print one by one of whatever it left	
		for (String item : col) {
			System.out.println(item);   // jane steve james
		}
		
	}
}	
	*/
	
	/*
// Exercise 2: 	
	public static void main(String[] args) {
	
	List<String> col = new ArrayList<String> ();
		
	col.add("Jane 1");
	col.add("Tom 2");
	col.add("Jane 3");
	col.add("Nish 4");
	
	System.out.println(col.size());
	System.out.println("========1==========");
	System.out.println("Hello");
	System.out.println("========2==========");
	System.out.println("Hi");
	System.out.println("========3==========");
	col.add("James 5");
	System.out.println(col.get(4));
	System.out.println("=========4=========");
	System.out.println(col.size());
	System.out.println("==========5========");
	System.out.println(col.get(0));
//	System.out.println(col.remove(0)); // it will remove but still show Jane in the print
	col.remove(0);  // this wont print, but remove it....list moves up to replace the removed seat, and the very last seat gets deleted
	System.out.println(col.get(3));  // if the previous one is removed, this one moves up to take that empty spot
	System.out.println("=========6=========");
	System.out.println(col.size());	
	
	}	
}	
	*/

	/*
// Exercise 1:	This is how String array works

	public static void main(String[] args) {

		String [] students = new String[4];   	// it counts normally like 1-4 for 4 total students
		
		students[0] = "James";      // but when invoking it, it starts from 0 to 3
		students[1] = "Jane";
		students[2] = "John";
		students[3] = "Steve";
//		students[4] = "tom";  // cant do coz we only defined we were going to have 4 total students 
			// ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println(students[3]);
				
		System.out.println("==================");
		students = new String[5];    // we are declaring new size or length of 5
		students[4] = "Tom";		// adding new student for that 5th place or 4th index value
		
		System.out.println(students[0]); 	// null coz since we updated the size, the students arrayName dumps out all the data, but unfortunately since haven't input anything, it comes out as null
		System.out.println(students[1]);	// null
		System.out.println(students[2]);	// null
		System.out.println(students[3]);	//null
		System.out.println(students[4]);  	// only tom is printed as that's the only input we have done after it has automatically dumped its old values
	}
}
	*/




