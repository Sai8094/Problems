package com.logical;

public class ElementsSum {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 7, 5 };
		elementsSum(input, 12);

	}

	static void elementsSum(int[] ar, int target) {
		for (int i = 0; i < ar.length - 2; i++) {
			if (ar[i] + ar[i + 1] + ar[i + 2] == target)
				System.out.println(ar[i] + "," + ar[i + 1] + "," + ar[i + 2]);

		}

	}
}
