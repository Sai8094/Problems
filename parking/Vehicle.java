package com.parking;

public abstract class Vehicle {
	static double charges;
	static Vehicle[] vehicles = new Vehicle[10];
	static int space = 0;
	
	abstract double vehicleCharges(double cahrge);
	abstract void displayVehiclesInfo();
	
}
