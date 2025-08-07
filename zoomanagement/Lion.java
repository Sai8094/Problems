package com.zoomanagement;

public class Lion implements Animal {
	private String healthStatus="Good";
	
	@Override
	public void eat() {
		System.out.println("Lion eating Meat");
	}

	@Override
	public void sleep() {
		System.out.println("Lion is Sleeping");
	}

	@Override
	public void makeSound() {
		System.out.println("Lion makes Sound");
	}

	public void getHealthStatus() {
		System.out.println("Lion's health status is: "+ this.healthStatus);
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

}
