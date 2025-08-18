package com.smarthome.device;

public class SecurityCamera implements Device {

	@Override
	public void on() {
		System.out.println("Camera Recording");
	}

	@Override
	public void off() {
		System.out.println("Camera OFF");
	}

}
