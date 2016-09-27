package collection;

import java.util.*;

class IterrateAMap {
	public static void main(String args[]) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "kumar");
		hm.put(102, "rai");
		hm.put(102, "manish");

		for (Map.Entry entry : hm.entrySet()) {
			System.out.println("Key =" + entry.getKey() + " and value = " + entry.getValue());
		}
		System.out.println("\n");
//----------------------------------------------------------------------------------------------------		
		for(Integer value : hm.keySet()){
			System.out.println("Key is="+ value +" and value is = "+hm.get(value));
		}
//-----------------------------------------------------------------------------------------------------		
		Iterator itr = hm.keySet().iterator();
		while(itr.hasNext()){
			int key =  (int) itr.next();
			System.out.println("--"+ key +"---"+hm.get(key));
		}
		
	}
}
