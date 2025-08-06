package com.bridge;

import java.util.HashMap;

public class BusSeatAllotment {

	public static void main(String[] args) {
		int[] ar = { 1, 3, 4, 1, 5, 6, 7, 5 };
		isBooked(ar);

	}

	static void isBooked(int[] ar) {
		HashMap<Integer, Integer> hs = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			hs.put(ar[i], hs.getOrDefault(ar[i], 0) + 1);
		}
		for (Integer n : hs.keySet()) {
			if (hs.get(n) == 1) {
				System.out.println("Seat " + n + "is booked");
			} else {
				System.out.println("Seat " + n + "is already booked");
			}
		}

	}
}
