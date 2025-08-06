package com.parking;

public abstract class Vehicle {
	abstract double vehicleCharges(double cahrge);
	static double charges;
	static Vehicle[] vehicles = new Vehicle[10];
	static int space=0;
	
	abstract void displayVehiclesInfo();

}
