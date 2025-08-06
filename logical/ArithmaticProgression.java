package com.logical;

public class ArithmaticProgression {

	public static void main(String[] args) {
		int[] input = { 2, 6, 8, 10, 12, 14, 16 };
		System.out.println(findMissingNumber(input));

	}

	static int findMissingNumber(int[] ar) {
		int dif1 = ar[1] - ar[0];
		int dif2 = ar[2] - ar[1];
		int dif = dif1 == dif2 ? dif1 : Math.min(dif1, dif2);

		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i + 1] - ar[i] != dif) {
				return ar[i] + dif;
			}
		}
		return -1;
	}

}
