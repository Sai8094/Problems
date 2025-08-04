package com.bridge;

public class AirportBoarding {

	public static void main(String[] args) {
		int[] ar = {101,103,102,106,104};
		System.out.println(passengerOrder(ar));

	}
	static int passengerOrder(int[]ar)
	{
		int count = 0;
		for(int i=1;i<=ar.length-1;i++)
		{
			if(ar[i-1] > ar[i])
				count++;
		}
		return count;
	}
}
