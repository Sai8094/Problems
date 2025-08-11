package com.oop;

public class ElectricCar extends Car {
	double fuel = 100;

	void drive(int hours) {
		Car c = new Car();
		if (hours >= 1) {
			fuel = fuel - 5;
		}
	}

	@Override
	public String toString() {
		return "ElectricCar [fuel=" + fuel + "]";
	}

}
