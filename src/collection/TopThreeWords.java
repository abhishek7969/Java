package collection;

import java.util.Scanner;
import java.util.TreeMap;

public class TopThreeWords {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap <String ,Integer>();
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String arr[] = str.split(" ");
		
		for(int i = 0 ; i <arr.length ; i++){			
			Integer minVal = (map.containsKey(arr[i])) ? map.put(arr[i], map.get(arr[i])+1) : map.put(arr[i], 1);			
		}
		
		System.out.println(map);
		
		
	}

}
