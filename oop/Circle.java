package com.oop;

public class Circle implements Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Area=" + getArea() + "]";
	}

}
