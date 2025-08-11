package com.oop;

public class MyDate {
	int day;
	int month;
	int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	boolean validateDate() {
		if (day <= 0 && day > 31)
			return false;
		else if (month <= 0 && month > 12)
			return false;
		else if (year <= 0)
			return false;

		return true;
	}

	int incrementDate() {
		if (validateDate()) {
			if (day < 31) {
				day++;
			}
		}
		return day;
	}

	void format() {
		if (validateDate())
			System.out.println(day + "-" + month + "-" + year);
	}

}
