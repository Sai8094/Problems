package com.parking;

public class Bike extends Vehicle {
	private String bikeNumber;
	private int checkInTime;
	private double charge;

	public Bike(String bikeNumber, int checkInTime) {
		this.bikeNumber = bikeNumber;
		this.checkInTime = checkInTime;
		Vehicle.vehicles[space++] = this;
	}

	public String getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(String bikeNumber) {
		this.bikeNumber = bikeNumber;
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
	double vehicleCharges(double charge) {
		this.charge = charge;
		Vehicle.charges += charge;
		return charge;
	}

	@Override
	void displayVehiclesInfo() {
		System.out.println("Bike Details");
		System.out.println("Bike number " + getBikeNumber());
		System.out.println("Bike Check in time " + getCheckInTime());
		System.out.println("Bike Charge " + getCharge());
		System.out.println();

	}

}
