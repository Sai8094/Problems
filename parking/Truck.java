package com.parking;

public class Truck extends Vehicle{
	private String truckNumber;
	private int checkInTime;
	private double charge;
	
	public Truck(String truckNumber, int checkInTime) {
		this.truckNumber = truckNumber;
		this.checkInTime = checkInTime;
		Vehicle.vehicles[space++] = this;
	}
	
	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
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
		System.out.println("Truck Details");
		System.out.println("Truck Number "+getTruckNumber());
		System.out.println("Truck Check in time "+getCheckInTime());
		System.out.println("Truck Charges "+getCharge());
		System.out.println();
		
	}
	
	

}
