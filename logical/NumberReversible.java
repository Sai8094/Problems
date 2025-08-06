package com.logical;

public class NumberReversible {

	public static void main(String[] args) {
		System.out.println(isReversible(27));

	}

	static boolean isReversible(int n) {
		int rev = 0, t = n;

		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		return (rev + t) % 2 == 1;
	}

}
