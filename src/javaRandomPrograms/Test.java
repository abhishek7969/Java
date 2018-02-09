package javaRandomPrograms;

public class Test {

	public static void main(String[] args) {
		String s = "abcabcssg";
		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(ch[i]) == s.lastIndexOf(ch[i])) {
				System.out.println("first non repetive is " + ch[i]);
				break;
			}
		}

	}

}
