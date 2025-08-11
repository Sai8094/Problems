package com.parking;

public class Car extends Vehicle {
	private String carNumber;
	private int checkInTime;
	private double charge;

	public Car(String carNumber, int checkInTime) {
		this.carNumber = carNumber;
		this.checkInTime = checkInTime;
		Vehicle.vehicles[space++] = this;

	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(int checkInTime) {
		this.checkInTime = checkInTime;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	@Override
	void displayVehiclesInfo() {
		System.out.println("Car Details");
		System.out.println("Car Number: " + getCarNumber());
		System.out.println("Car Check In Time " + getCheckInTime());
		System.out.println("Car Charges " + getCharge());
		System.out.println();

	}

	@Override
	double vehicleCharges(double charge) {
		this.charge = charge;
		Vehicle.charges += charge;
		return charge;
	}

}
