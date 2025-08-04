package com.bridge;

public class CustomPassword {

	public static void main(String[] args) {
		String str = "java123";
		System.out.println(customizePassword(str));

	}

	static String customizePassword(String str) {
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				sb.append('@');
			}
			else if (Character.isDigit(ch)) {
				if ((int) ch % 2 == 0) {
					sb.append('*');
				}else {
					sb.append(ch);
				}
			}else {
			sb.append(ch);}
		}
		return new String(sb).toUpperCase();
	}

}
