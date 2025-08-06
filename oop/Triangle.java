package com.oop;

public class Triangle implements Shape {
	double base;
	double height;
	
	public Triangle(double base,double height) {
		this.base = base;
		this.height = height;
				
	}
	
	@Override
	public double getArea() {
		
		return 0.5*base*height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", Area=" + getArea() + "]";
	}

}
