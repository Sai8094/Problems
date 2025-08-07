package com.tollbooth;

public class Bike implements Vehicle {
	private String bikeNumber;
	private double tollAmount;
	
	public String getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(String bikeNumber) {
		this.bikeNumber = bikeNumber;
	}

	public void setTollAmount(double tollAmount) {
		this.tollAmount = tollAmount;
	}

	@Override
	public void getTollAmount() {
		System.out.println("Toll Amount: "+ this.tollAmount);
	}

	@Override
	public void getStayLength() {
		System.out.println("Stay length: "+ 2.5+" minutes");
	}

}
