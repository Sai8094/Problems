package com.oop;

public class MainDate {

	public static void main(String[] args) {
		MyDate myDate = new MyDate(12, 32, 2);
		System.out.println(myDate.incrementDate());
		System.out.println(myDate.validateDate());
		myDate.format();

	}

}
