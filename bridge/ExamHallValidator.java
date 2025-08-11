package com.bridge;

public class ExamHallValidator {

	public static void main(String[] args) {
		int[] input = { 21, 34, 43, 52 };

	}

	static void seatValidate(int[] input) {
		for (int i = 1; i <= input.length - 1; i++) {

			int d1 = input[i - 1] % 10;
			int d2 = input[i] % 10;
			if (d1 != d2) {
				System.out.println("Invalid");
				break;
			}

		}
	}

}
