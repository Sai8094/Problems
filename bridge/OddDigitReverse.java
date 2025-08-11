package com.bridge;

public class OddDigitReverse {

	public static void main(String[] args) {

		System.out.println(oddNumReverse(123456789));
	}

	static int oddNumReverse(int number) {
		int reverse = 0;
		do {
			int digit = number % 10;
			if (digit % 2 == 1) {
				reverse = reverse * 10 + digit;
			}
			number = number / 10;
		} while (number != 0);
		return reverse;
	}
}
