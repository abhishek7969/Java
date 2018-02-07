package collection.set;

import java.util.HashSet;

public class SetToArray {

	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("element 1");
		hSet.add("elemenr 2");
		hSet.add("element 3");
		
		String[] array = new String[hSet.size()];
		hSet.toArray(array);
		
		for (String s : array) {
			System.out.println(s);
		}
	}
}
