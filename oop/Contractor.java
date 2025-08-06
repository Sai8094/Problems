package com.oop;

public class Contractor implements Employee {
	double salary = 15000;
	@Override
	public double calculateSalary() {
		return 12*salary;
	}
	@Override
	public String toString() {
		return "Contractor [salary=" + salary + ", Annual Salary=" + calculateSalary() + "]";
	}
	

}
