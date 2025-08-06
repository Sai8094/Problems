package com.bridge;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(363));

	}

	static boolean isPalindrome(int n) {
		int rev = 0, t = n, dsum = 0;
		while (n != 0) {
			int d = n % 10;
			dsum = dsum + d;
			rev = rev * 10 + d;
			n = n / 10;
		}
		return rev == t && dsum % 3 == 0;
	}
}
