package com.tollbooth;

public class Car implements Vehicle {
	private String carNumber;
	private double tollAmount;

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
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
		System.out.println("Stay length: "+ 3.5+" minutes");
	}
	
}
