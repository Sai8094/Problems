package com.smarthome.device;

public class Light implements Device {

	@Override
	public void on() {
		System.out.println("Light ON");
	}

	@Override
	public void off() {
		System.out.println("Light OFF");
	}

}
