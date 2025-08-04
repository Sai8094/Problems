package com.bridge;

public class ExamHallValidator {

	public static void main(String[] args) {
		int[] ar = {21,34,43,52};
		

	}
	static void seatValidate(int[] ar)
	{
		for(int i=1;i<=ar.length-1;i++)
		{
			
				int d1 = ar[i-1]%10;
				int d2 = ar[i]%10;
				if(d1!=d2) {
					System.out.println("Invalid");
					break;}
			
		}
	}

}
