package com.parking;

public class ParkingSystem {

	public static void main(String[] args) {
		System.out.println("Parking System");

		ParkingSlots parkingSlots = new ParkingSlots();
		parkingSlots.registerVehicle(new Car("KA0312", 12));
		parkingSlots.registerVehicle(new Car("KA0388", 5));
		parkingSlots.registerVehicle(new Truck("KA0312", 2));
		parkingSlots.registerVehicle(new Bike("KA0415", 6));

		parkingSlots.registeredVehicles();
		System.out.println("Available Slots: " + parkingSlots.availableSlots());

	}

}
