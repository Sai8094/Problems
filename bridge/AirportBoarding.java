package com.bridge;

public class AirportBoarding {

	public static void main(String[] args) {
		int[] input = { 101, 103, 102, 106, 104 };
		System.out.println(passengerOrder(input));
	}

	static int passengerOrder(int[] input) {
		int count = 0;
		for (int i = 1; i <= input.length - 1; i++) {
			if (input[i - 1] > input[i])
				count++;
		}
		return count;
	}
}
