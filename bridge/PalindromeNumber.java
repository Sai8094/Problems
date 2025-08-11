package com.bridge;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(363));
	}

	static boolean isPalindrome(int number) {
		int reverse = 0, t = number, digitSum = 0;
		while (number != 0) {
			int digit = number % 10;
			digitSum = digitSum + digit;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		return reverse == t && digitSum % 3 == 0;
	}
}
