package com.tollbooth;

public class TollBooth {

	public static void main(String[] args) {
		
		TollBoothImpl tollBooth = new TollBoothImpl();
		
		Bike bike = new Bike();
		bike.setBikeNumber("KA0467");
		bike.setTollAmount(100);
		tollBooth.vehicleEntry(bike);
		System.out.println();
		
		Car car = new Car();
		car.setCarNumber("KA0312");
		car.setTollAmount(150);
		tollBooth.vehicleEntry(car);
		System.out.println();
		
		Truck truck = new Truck();
		truck.setTruckNumber("KA0219");
		truck.setTollAmount(200);
		tollBooth.vehicleEntry(truck);
		System.out.println();
	}

}
