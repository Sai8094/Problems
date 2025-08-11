package com.oop;

public class FullTime implements Employee {
	double salary = 20000;

	@Override
	public double calculateSalary() {

		return 12 * salary;
	}

	@Override
	public String toString() {
		return "FullTime [salary=" + salary + ", Annual Salary=" + calculateSalary() + "]";
	}

}
