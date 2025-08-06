package com.logical;

public class SecondHighest {

	public static void main(String[] args) {
		int[] ar = { 3, 1, 4, 4, 5, 5, 2 };
		System.out.println(findSecondHighest(ar));
	}

	static int findSecondHighest(int[] ar) {
		int fmax = ar[0], smax = 0;

		for (int i = 1; i <= ar.length - 1; i++) {
			if (ar[i] > fmax) {
				smax = fmax;
				fmax = ar[i];
			} else if (ar[i] != fmax && ar[i] > smax) {
				smax = ar[i];
			}
		}
		return smax;

	}

}
