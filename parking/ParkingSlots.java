package com.parking;

public class ParkingSlots {
	
	void registerVehicle(Vehicle vehicle)
	{
		for(int i=0;i<Vehicle.vehicles.length;i++)
		{
			if(Vehicle.vehicles[i] instanceof Car) {
				Vehicle.vehicles[i].vehicleCharges(50);
			}
			else if(Vehicle.vehicles[i] instanceof Bike) {
				Vehicle.vehicles[i].vehicleCharges(20);
			}
			else if(Vehicle.vehicles[i] instanceof Truck){
				Vehicle.vehicles[i].vehicleCharges(70);
			}
		}
	}
	
	void registeredVehicles()
	{
		for(int i=0;i<Vehicle.vehicles.length;i++)
		{
			if(Vehicle.vehicles[i] instanceof Car) {
				Vehicle.vehicles[i].displayVehiclesInfo();
			}
			else if(Vehicle.vehicles[i] instanceof Bike) {
				Vehicle.vehicles[i].displayVehiclesInfo();
			}
			else if(Vehicle.vehicles[i] instanceof Truck){
				Vehicle.vehicles[i].displayVehiclesInfo();
			}
		}
	}
	 int availableSlots()
	 {
		 return Vehicle.vehicles.length- Vehicle.space;
	 }

}
