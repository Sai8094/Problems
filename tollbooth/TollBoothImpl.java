package com.tollbooth;

public class TollBoothImpl {

	void vehicleEntry(Vehicle vehicle) {
		if (vehicle instanceof Bike) {
			System.out.println("Bike Number: " + ((Bike) vehicle).getBikeNumber());
			vehicle.getTollAmount();
			vehicle.getStayLength();
		}
		
		else if (vehicle instanceof Car) {
			System.out.println("Car Number: " + ((Car) vehicle).getCarNumber());
			vehicle.getTollAmount();
			vehicle.getStayLength();
		} 
		
		else if (vehicle instanceof Truck) {
			System.out.println("Truck Number:" + ((Truck) vehicle).getTruckNumber());
			vehicle.getTollAmount();
			vehicle.getStayLength();
		}
	}

}
