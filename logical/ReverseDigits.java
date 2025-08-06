package com.logical;

import java.util.Stack;

public class ReverseDigits {

	public static void main(String[] args) {
		System.out.println(reverseDigits("a1b2c3d4"));

	}

	static String reverseDigits(String str) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				st.push(ch);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				sb.append(str.charAt(i));
				if (!st.isEmpty())
					sb.append(st.pop());
			}
		}
		return new String(sb);
	}

}
