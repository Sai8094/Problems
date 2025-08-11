package com.oop;

public class PartTime implements Employee {
	double salary = 10000;

	@Override
	public double calculateSalary() {

		return 12 * 10000;
	}

	@Override
	public String toString() {
		return "PartTime [salary=" + salary + ", Annual Salary=" + calculateSalary() + "]";
	}

}
