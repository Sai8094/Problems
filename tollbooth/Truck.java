package com.tollbooth;

public class Truck implements Vehicle {
	private String truckNumber;
	private double tollAmount;

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	public void setTollAmount(double tollAmount) {
		this.tollAmount = tollAmount;
	}

	@Override
	public void getTollAmount() {
		System.out.println("Toll Amount: " + this.tollAmount);
	}

	@Override
	public void getStayLength() {
		System.out.println("Stay length: " + 5.0 + " minutes");
	}

}
