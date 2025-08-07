package com.zoomanagement;

public class ZooManagement {

	public static void main(String[] args) {
		
		Lion lion = new Lion();
		lion.eat();
		lion.makeSound();
		lion.getHealthStatus();
		lion.sleep();
		System.out.println();
		
		Elephant elephant = new Elephant();
		elephant.eat();
		elephant.makeSound();
		elephant.getHealthStatus();
		elephant.sleep();
		System.out.println();
		
		Monkey monkey = new Monkey();
		monkey.eat();
		monkey.makeSound();
		monkey.getHealthStatus();
		monkey.sleep();
		System.out.println();
	}

}
