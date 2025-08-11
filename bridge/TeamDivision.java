package com.bridge;

public class TeamDivision {

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 40 };
		balancedTeams(input);

	}

	static void balancedTeams(int[] input) {
		int sum = 0;
		;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == sum / 2) {
					System.out.println(input[i] + "," + input[j]);
				}
			}

		}

	}

}
