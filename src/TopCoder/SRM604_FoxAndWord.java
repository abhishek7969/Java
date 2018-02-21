package TopCoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SRM604_FoxAndWord {

	public static void main(String[] args) {

		String str[] = 	
			{"top", "coder"}			;

		System.out.println(howManyPairs(str));
	}

	public static int howManyPairs(String[] words) {
		Set<String> set = new HashSet<String>();

		for (int j = 0; j < words.length; j++) {
			String word = words[j];
			System.out.println("word got "+word);
			for (int i = 0; i < words[j].length()-1; i++) {
				String A = word.substring(0, i + 1);
				String B = word.replaceFirst(A, "");
				String S = B + A;
				
				if (Arrays.asList(words).contains(S) && !(S.equals(word))) {
					set.add(S);
				}
			}
		}
		System.out.println("--"+set);

		return set.size();
	}

}
