package com.oop;

public class Car {
	static double speed=60;
	static double fuel=20;
	static double distance=0;
	
	
	void drive(int hours)
	{
		if(hours >=1) {
			distance += 5;
			fuel--;
		}
	}


	@Override
	public String toString() {
		return "Car [speed=" + speed + ", fuel=" + fuel + ", distance=" + distance + "]";
	}
	
	

}
