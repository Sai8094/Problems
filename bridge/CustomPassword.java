package com.bridge;

public class CustomPassword {

	public static void main(String[] args) {
		String string = "java123";
		System.out.println(customizePassword(string));

	}
	static String customizePassword(String string) {
		string = string.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			Character ch = string.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				sb.append('@');
			} else if (Character.isDigit(ch)) {
				if ((int) ch % 2 == 0) {
					sb.append('*');
				} else {
					sb.append(ch);
				}
			} else {
				sb.append(ch);
			}
		}
		return new String(sb).toUpperCase();
	}

}
