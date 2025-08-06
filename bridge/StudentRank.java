package com.bridge;

public class StudentRank {

	public static void main(String[] args) {
		int[] ar = { 50, 80, 100, 60, 90, 20, 10 };
		studentRank(ar);

	}

	static void studentRank(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - i - 1; j++) {
				if (ar[j + 1] > ar[j]) {
					int t = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}
	}

}
