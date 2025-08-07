package com.zoomanagement;

public class Monkey implements Animal {
	private String healthStatus;
	
	@Override
	public void eat() {
		System.out.println("Monkey eat Banana");
	}

	@Override
	public void sleep() {
		System.out.println("Monkey is Sleeping");
	}

	@Override
	public void makeSound() {
		System.out.println("Monkey makes Sound");
	}
	
	public void getHealthStatus() {
		System.out.println("Monkey's health status is "+this.healthStatus);
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

}
