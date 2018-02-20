package TopCoder;

import java.util.HashSet;
import java.util.Set;

public class SRM584_TopFox {

	public static void main(String[] args) {
		possibleHandles("ababababab", "bababababa");
	}

	public static int possibleHandles(String familyName, String givenName) {
		
		char [] fn = familyName.toCharArray();
		char[] gn = givenName.toCharArray();
		Set<String> set = new HashSet<String>();
		
		for(int i =0 ; i< fn.length ; i++){
			String topStr= familyName.substring(0,i+1);
			for(int j = 0 ; j< gn.length; j++){
				String tem = givenName.substring(0,j+1);
				set.add(topStr+tem);
			}
		}
		
		System.out.println(set.size());
		return 0;
	}
}
