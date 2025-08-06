package com.logical;

public class RepeatingPattern {

	public static void main(String[] args) {

		System.out.println(findRepeatingPattern("abcabcabc"));
	}

	static String findRepeatingPattern(String str) {
		String res = null;
		for (int i = 0; i < str.length() - 2; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i + 1);
			char ch3 = str.charAt(i + 2);
			if (ch1 != ch2 && ch2 != ch3 && ch3 != ch1) {
				res = "" + ch1 + ch2 + ch3;
				for (int j = i + 1; j < str.length() - 3; j++) {
					String s = str.substring(j, j + 3);
					if (s.equals(res)) {
						return s;
					}
				}
			}
		}
		return "Pattern not found";
	}
}
