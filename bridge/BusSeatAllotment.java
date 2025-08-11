package com.bridge;

import java.util.HashMap;

public class BusSeatAllotment {

	public static void main(String[] args) {
		int[] input = { 1, 3, 4, 1, 5, 6, 7, 5 };
		isBooked(input);
	}

	static void isBooked(int[] input) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			hashMap.put(input[i],hashMap.getOrDefault(input[i], 0) + 1);
		}
		for (Integer n : hashMap.keySet()) {
			if (hashMap.get(n) == 1) {
				System.out.println("Seat " + n + "is booked");
			} else {
				System.out.println("Seat " + n + "is already booked");
			}
		}
	}
}
