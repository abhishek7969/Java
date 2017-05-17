package collection.iterator.list_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		/**
		 * Bi-directional list iterator
		 */
		ListIterator<String> lit =  list.listIterator();
		
		/**
		 * Iterating forwards
		 */
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		
		/**
		 * Iterating backwards
		 */
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
	}
}

/**
 * Limitations of ListIterator
 * It is an Iterator only List implementation classes.
 * It is not a Universal Java Cursor.
 * Compare to Spliterator, it does NOT support Parallel iteration of elements.
 * Compare to Spliterator, it does NOT support better performance to iterate large volume of data.
*/