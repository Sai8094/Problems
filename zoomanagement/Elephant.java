package com.zoomanagement;

public class Elephant implements Animal {
	private String healthStatus="Good";
	
	@Override
	public void eat() {
		System.out.println("Elephant eating sugercane");
	}

	@Override
	public void sleep() {
		System.out.println("Elephant is Sleeping");
	}

	@Override
	public void makeSound() {
		System.out.println("Elephant makes Sound");
	}

	public void getHealthStatus() {
		System.out.println("Elephant's health status is "+this.healthStatus);
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}
	

}
