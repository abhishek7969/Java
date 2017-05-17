package collection.iterator.java_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		for(String str : list){
			System.out.println(str);
		}
	}
}
