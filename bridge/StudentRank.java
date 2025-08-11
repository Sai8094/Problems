package com.bridge;

public class StudentRank {

	public static void main(String[] args) {
		int[] marks = { 50, 80, 100, 60, 90, 20, 10 };
		studentRank(marks);

	}

	static void studentRank(int[] marks) {
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks.length - i - 1; j++) {
				if (marks[j + 1] > marks[j]) {
					int swap = marks[j];
					marks[j] = marks[j + 1];
					marks[j + 1] = swap;
				}
			}
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);

		}
	}

}
