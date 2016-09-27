package collection;
import java.util.*;

class ExampleOne{
 public static void main(String args[]){
 
HashMap<Integer,String>  hm = new HashMap<Integer,String>();
hm.put(100,"Amit");
hm.put(101,"kumar");
hm.put(102,"rai");
hm.put(102,"manish");

	for(Map.Entry entry : hm.entrySet()){
	System.out.println("Key ="+entry.getKey()+ " and value = "+entry.getValue());
	}
					}
}
