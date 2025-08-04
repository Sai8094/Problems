package com.bridge;

public class TeamDivision {

	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40 };
		balancedTeams(ar);

	}

	static void balancedTeams(int[] ar) {
		int sum = 0;
		;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] + ar[j] == sum / 2) {
					System.out.println(ar[i] + "," + ar[j]);
				}
			}

		}

	}

}
