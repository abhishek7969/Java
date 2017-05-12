package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	/**
	  Looking at the output, its clear that ConcurrentHashMap takes care of any new entry in the map 
	  whereas HashMap throws ConcurrentModificationException.
	  Lets look at the exception stack trace closely. The statement that has thrown Exception is:
	  String key = it1.next();
	  It means that the new entry got inserted in the HashMap but Iterator is failing. 
	  Actually Iterator on Collection objects are fail-fast i.e any modification in the structure or the number of entry in the collection object will trigger this exception thrown by iterator.
	  So How does iterator knows that there has been some modification in the HashMap. 
	  We have taken the set of keys from HashMap once and then iterating over it.
	  HashMap contains a variable to count the number of modifications and iterator use it when you call its next() function to get the next entry.
	 
	  Ref :- http://www.journaldev.com/122/java-concurrenthashmap-example-iterator
	 */

	public static void main(String[] args) {

		//ConcurrentHashMap
		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");
		System.out.println("ConcurrentHashMap before iterator: "+myMap);
		Iterator<String> it = myMap.keySet().iterator();

		while(it.hasNext()){
			String key = it.next();
			if(key.equals("3")) myMap.put(key+"new", "new3");
		}
		System.out.println("ConcurrentHashMap after iterator: "+myMap);

		//HashMap
		myMap = new HashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");
		System.out.println("HashMap before iterator: "+myMap);
		Iterator<String> it1 = myMap.keySet().iterator();

		while(it1.hasNext()){
			String key = it1.next();
			if(key.equals("3")){ 
				myMap.put(key+"new", "new3"); //Changing both key and value will throw an ConcurrentModificationException 
				myMap.put(key, "new3"); //Changing only value will not throw any exception i.e modCount is for key only, since we are not changing the structure of the map the exception is not thrown.
				break;
			}
		}
		System.out.println("HashMap after iterator: "+myMap);
	}

}