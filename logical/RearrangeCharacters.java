package com.logical;

public class RearrangeCharacters {

	public static void main(String[] args) {
		System.out.println(rearrangeCharacter("aaabbc"));
	}

	static String rearrangeCharacter(String str) {
		String s1 = str.substring(0, str.length() / 2);
		String s2 = str.substring(str.length() / 2);
		StringBuilder sb = new StringBuilder();
		int i = 0, j = 0;
		while (i < s1.length() || j < s2.length()) {
			if (i < s1.length())
				sb.append(s1.charAt(i++));
			if (j < s2.length())
				sb.append(s2.charAt(j++));
		}
		return new String(sb);
	}
}
