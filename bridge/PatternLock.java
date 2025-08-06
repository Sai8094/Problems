package com.bridge;

import java.util.Scanner;

public class PatternLock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int attempt = 5;
		String pattern = "1234";
		String s = new String();
		System.out.println("Enter a pattern");
		while (attempt > 0) {
			s = sc.nextLine();

			if (s.equals(pattern)) {
				System.out.println("Sucess");
				return;
			}
			attempt--;

		}
		System.out.println("System is Locked");

	}

}
