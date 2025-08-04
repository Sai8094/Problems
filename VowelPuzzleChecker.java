package com.bridge;

import java.util.Scanner;

public class VowelPuzzleChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		validePuzzleWord(str);
	}

	static void validePuzzleWord(String str) {
		str = str.toLowerCase();

		String str1 = "aeiou";
		int count = 0;
		if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o'
				|| str.charAt(0) == 'u') {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (str1.indexOf(ch) != -1) {
					count++;
				}
			}
			if (count <= 4) {
				System.out.println("Valid");
			}
		} else {
			System.out.println("Not Valid");
		}
	}
}
