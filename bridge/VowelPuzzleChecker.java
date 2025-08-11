package com.bridge;

import java.util.Scanner;

public class VowelPuzzleChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		validePuzzleWord(string);
	}

	static void validePuzzleWord(String string) {
		string = string.toLowerCase();

		String string1 = "aeiou";
		int count = 0;
		if (string.charAt(0) == 'a' || string.charAt(0) == 'e' || string.charAt(0) == 'i' || string.charAt(0) == 'o'
				|| string.charAt(0) == 'u') {
			for (int i = 0; i < string.length(); i++) {
				char ch = string.charAt(i);
				if (string1.indexOf(ch) != -1) {
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
